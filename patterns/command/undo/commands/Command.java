package command.undo.commands;

public interface Command {
    void execute();
    void undo();
}
