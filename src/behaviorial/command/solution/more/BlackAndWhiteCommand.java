package behaviorial.command.solution.more;

import behaviorial.command.solution.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("applying B&W filter..");
    }
}
