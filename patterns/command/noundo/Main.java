package command.noundo;

import command.noundo.invokers.RemoteController;
import command.undo.receivers.CeilFan;
import command.undo.receivers.Light;
import command.undo.receivers.Stereo;

public class Main {
    private static RemoteController controller;
    private static Light light;
    private static CeilFan fan;
    private static Stereo stereo;

    public static void main(String[] args) {
        setupReceivers();
        setupInvoker();
        setupCommands();

        System.out.println(controller);

        controller.OnButtonWasPushed(0);
        controller.OnButtonWasPushed(1);
        controller.OnButtonWasPushed(2);
        controller.OnButtonWasPushed(3);

        controller.OffButtonWasPushed(0);
        controller.OffButtonWasPushed(1);
        controller.OffButtonWasPushed(2);
        controller.OffButtonWasPushed(3);
    }

    public static void setupInvoker() {
        controller = new RemoteController();
    }

    public static void setupReceivers() {
        light = new Light();
        fan = new CeilFan();
        stereo = new Stereo();
    }

    public static void setupCommands() {
        controller.setCommand(0, light::on, light::off);
        controller.setCommand(1, fan::medium, fan::off);
        controller.setCommand(2, () -> {stereo.on(); stereo.setCD(); stereo.setVolume(20);}, stereo::off);
        controller.setCommand(3, () -> {light.on(); fan.high(); stereo.on();}, () -> {light.off(); fan.off(); stereo.off();});
    }
}
