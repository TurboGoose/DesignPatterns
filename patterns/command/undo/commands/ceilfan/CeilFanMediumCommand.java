package command.undo.commands.ceilfan;

import command.undo.receivers.CeilFan;

public class CeilFanMediumCommand extends CeilFanCommand {

    public CeilFanMediumCommand(CeilFan fan) {
        super(fan);
    }

    @Override
    public void execute() {
        super.execute();
        fan.medium();
    }
}
