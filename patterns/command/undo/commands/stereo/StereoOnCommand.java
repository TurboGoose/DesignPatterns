package command.undo.commands.stereo;

import command.undo.commands.Command;
import command.undo.receivers.Stereo;

public class StereoOnCommand implements Command {
    private final Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }


    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(20);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
