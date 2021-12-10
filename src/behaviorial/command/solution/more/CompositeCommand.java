package behaviorial.command.solution.more;

import behaviorial.command.solution.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    private final List<Command> commands = new ArrayList<>();
    public void addCommand(Command command){
        commands.add(command);
    }
    @Override
    public void execute() {
        for (Command command : commands){
            command.execute();
        }
    }
}
