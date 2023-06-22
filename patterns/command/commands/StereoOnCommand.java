package command.commands;

import command.receivers.Stereo;

public class StereoOnCommand implements Command {
    private final Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(50);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
