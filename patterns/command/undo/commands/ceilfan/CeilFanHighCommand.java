package command.undo.commands.ceilfan;

import command.undo.receivers.CeilFan;

public class CeilFanHighCommand extends CeilFanCommand{

    public CeilFanHighCommand(CeilFan fan) {
        super(fan);
    }

    @Override
    public void execute() {
        super.execute();
        fan.high();
    }
}
