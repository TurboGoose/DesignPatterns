package command.invokers;

import command.commands.Command;
import command.commands.NoCommand;

public class RemoteControl {
    private static final int SLOT_COUNT = 7;
    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < SLOT_COUNT; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
        undoCommand = new NoCommand();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("======= Remote control =======").append(System.lineSeparator());
        for (int i = 0; i < SLOT_COUNT; i++) {
            sb.append(String.format("[slot %d] %s \t %s%n", i,
                    onCommands[i].getClass().getSimpleName(),
                    offCommands[i].getClass().getSimpleName()));
        }
        sb.append("[undo] ").append(undoCommand.getClass().getSimpleName());
        return sb.toString();
    }
}
