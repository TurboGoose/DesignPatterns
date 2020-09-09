package command.undo.commands.stereo;

import command.undo.commands.Command;
import command.undo.receivers.Stereo;

public class StereoOffCommand implements Command {
    private final Stereo stereo;
    private int prevVolume;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        prevVolume = stereo.getVolume();
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(prevVolume);
    }
}
