package command.undo.invokers;

import command.undo.commands.Command;
import command.undo.commands.NoCommand;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoteController {
    private final int NUMBER_OF_SLOTS = 5;
    private Command[] onCommands;
    private Command[] offCommands;
    private Deque<Command> commandStack;

    public RemoteController() {
        onCommands = new Command[NUMBER_OF_SLOTS];
        offCommands = new Command[NUMBER_OF_SLOTS];
        commandStack = new ArrayDeque<>();

        for (int i = 0; i < NUMBER_OF_SLOTS; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void OnButtonWasPushed(int slot) {
        commandStack.push(onCommands[slot]);
        onCommands[slot].execute();
    }

    public void OffButtonWasPushed(int slot) {
        commandStack.push(offCommands[slot]);
        offCommands[slot].execute();
    }

    public void undoButtonWasPushed() {
        if (!commandStack.isEmpty())
            commandStack.pop().undo();
    }


    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("\n---------------- REMOTE CONTROLLER ----------------\n");
        for (int i = 0; i < NUMBER_OF_SLOTS; i++)
            string.append(String.format("[%d]  ->  %-25s %-25s \n", i, onCommands[i].getClass().getSimpleName(), offCommands[i].getClass().getSimpleName()));
        Command lastCommand = commandStack.peek();
        string.append(String.format("Undo Button  ->  %s\n", lastCommand != null ? lastCommand.getClass().getSimpleName() : "NoCommand"));
        string.append("---------------------------------------------------\n");

        return string.toString();
    }
}
