package command.commands;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Execute with no effect");
    }

    @Override
    public void undo() {
        System.out.println("Undo with no effect");
    }
}
