package command.undo.commands.ceilfan;

import command.undo.receivers.CeilFan;

public class CeilFanLowCommand extends CeilFanCommand {

    public CeilFanLowCommand(CeilFan fan) {
        super(fan);
    }

    @Override
    public void execute() {
        super.execute();
        fan.low();
    }
}
