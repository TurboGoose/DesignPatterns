package command.undo.commands.ceilfan;

import command.undo.receivers.CeilFan;

public class CeilFanOffCommand extends CeilFanCommand {
    public CeilFanOffCommand(CeilFan fan) {
        super(fan);
    }

    @Override
    public void execute() {
        super.execute();
        fan.off();
    }
}
