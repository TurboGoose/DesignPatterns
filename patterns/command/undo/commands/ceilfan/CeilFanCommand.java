package command.undo.commands.ceilfan;

import command.undo.commands.Command;
import command.undo.receivers.CeilFan;

public abstract class CeilFanCommand implements Command {
    protected final CeilFan fan;
    private CeilFan.Speed prevSpeed;

    public CeilFanCommand(CeilFan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        prevSpeed = fan.getFanSpeed();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case LOW -> fan.low();
            case MEDIUM -> fan.medium();
            case HIGH -> fan.high();
            case OFF -> fan.off();
        }
    }
}
