package command;

import command.commands.*;
import command.invokers.RemoteControl;
import command.receivers.CeilingFan;
import command.receivers.Light;
import command.receivers.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo();
        CeilingFan fan = new CeilingFan();


        RemoteControl remote = new RemoteControl();
        System.out.println(remote);
        System.out.println();

        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);

        Command stereoOn = new StereoOnCommand(stereo);
        Command stereoOff = new StereoOffCommand(stereo);

        Command fanOff = new FanOffCommand(fan);
        Command fanLow = new FanLowCommand(fan);
        Command fanHigh = new FanHighCommand(fan);
        Command fanMedium = new FanMediumCommand(fan);

        Command[] partyOn = new Command[] {livingRoomLightOn, stereoOn, fanHigh};
        Command[] partyOff = new Command[] {livingRoomLightOff, stereoOff, fanOff};

        Command macroOn = new MacroCommand(partyOn);
        Command macroOff = new MacroCommand(partyOff);

        remote.setCommands(0, kitchenLightOn, kitchenLightOff);
        remote.setCommands(1, livingRoomLightOn, livingRoomLightOff);
        remote.setCommands(2, stereoOn, stereoOff);
        remote.setCommands(3, fanMedium, fanOff);
        remote.setCommands(4, macroOn, macroOff);
        System.out.println(remote);
        System.out.println();

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();
        System.out.println();

        remote.onButtonWasPushed(3);
        remote.undoButtonWasPushed();
        remote.offButtonWasPushed(3);
        remote.undoButtonWasPushed();
        System.out.println();

        remote.onButtonWasPushed(4);
        remote.undoButtonWasPushed();
        remote.offButtonWasPushed(4);
    }
}
