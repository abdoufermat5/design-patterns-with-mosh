package behaviorial.command.solution.editor;

public interface UndoableCommand extends Command {
    void unExecute();
}
