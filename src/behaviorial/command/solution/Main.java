package behaviorial.command.solution;

import behaviorial.command.solution.more.BlackAndWhiteCommand;
import behaviorial.command.solution.more.CompositeCommand;
import behaviorial.command.solution.more.ResizeCommand;

public class Main {
    public static void main(String[] args) {
        /*CustomerService service = new CustomerService();
        Command behaviorial.command = new AddCustomerCommand(service);
        Button button = new Button(behaviorial.command);

        button.click();
        */
        CompositeCommand composite = new CompositeCommand();
        composite.addCommand(new ResizeCommand());
        composite.addCommand(new BlackAndWhiteCommand());
        composite.execute();
    }
}
