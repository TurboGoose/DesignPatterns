package command.noundo.invokers;

import command.noundo.commands.Command;

public class RemoteController {
    private final int NUMBER_OF_SLOTS = 4;
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteController() {
        onCommands = new Command[NUMBER_OF_SLOTS];
        offCommands = new Command[NUMBER_OF_SLOTS];

        for (int i = 0; i < NUMBER_OF_SLOTS; i++) {
            onCommands[i] = () -> {};
            offCommands[i] = () -> {};
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void OnButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void OffButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    /*
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("-------- REMOTE CONTROLLER --------\n");
        for (int i = 0; i < NUMBER_OF_SLOTS; i++) {
            string.append("[ " + i + 1 + " ] -> " + onCommands[i] + "\t" + offCommands[i] + "\n");
        }
        string.append("-----------------------------------");
        return string.toString();
    }

     */
}
