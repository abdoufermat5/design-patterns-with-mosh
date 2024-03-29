package behaviorial.command.solution.editor;

public class UndoCommand implements Command{
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if(history.getSize()> 0)
            history.pop().unExecute();
    }
}
