package command.commands;

import command.receivers.CeilingFan;

public class FanMediumCommand implements Command {
    private final CeilingFan fan;
    private int prevSpeed;

    public FanMediumCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.medium();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case 0 -> fan.off();
            case 1 -> fan.low();
            case 2 -> fan.medium();
            case 3 -> fan.high();
            default -> System.out.println("No effect on fan");
        }
        prevSpeed = -1;
    }
}
