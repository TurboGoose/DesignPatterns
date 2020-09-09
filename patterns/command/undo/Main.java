package command.undo;

import command.undo.commands.ceilfan.CeilFanHighCommand;
import command.undo.commands.ceilfan.CeilFanLowCommand;
import command.undo.commands.ceilfan.CeilFanMediumCommand;
import command.undo.commands.ceilfan.CeilFanOffCommand;
import command.undo.commands.light.LightOffCommand;
import command.undo.commands.light.LightOnCommand;
import command.undo.commands.stereo.StereoOffCommand;
import command.undo.commands.stereo.StereoOnCommand;
import command.undo.invokers.RemoteController;
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
        System.out.println(controller);

        controller.OnButtonWasPushed(2);
        System.out.println(controller);

        controller.undoButtonWasPushed();
        System.out.println(controller);

        controller.undoButtonWasPushed();
        System.out.println(controller);
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
        controller.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
        controller.setCommand(1, new CeilFanLowCommand(fan), new CeilFanOffCommand(fan));
        controller.setCommand(2, new CeilFanMediumCommand(fan), new CeilFanOffCommand(fan));
        controller.setCommand(3, new CeilFanHighCommand(fan), new CeilFanOffCommand(fan));
        controller.setCommand(4, new StereoOnCommand(stereo), new StereoOffCommand(stereo));
    }
}
