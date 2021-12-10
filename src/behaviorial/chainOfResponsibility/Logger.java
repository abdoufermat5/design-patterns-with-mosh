package behaviorial.chainOfResponsibility;

public class Logger extends Handler{

    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Log - 2");
        return false;
    }
}
