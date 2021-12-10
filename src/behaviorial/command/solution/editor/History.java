package behaviorial.command.solution.editor;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    Deque<UndoableCommand> commands = new ArrayDeque();

    public void push(UndoableCommand command){
        commands.add(command);
    }

    public UndoableCommand pop() {
        return commands.pop();
    }

    public int getSize(){
        return commands.size();
    }
}
