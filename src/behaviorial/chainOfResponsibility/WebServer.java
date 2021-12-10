package behaviorial.chainOfResponsibility;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request){
        /*
        // Authentication
        Authenticator authenticator = new Authenticator();
        authenticator.authenticate(request);
        // Login
        // Compress

        -#####AS WE CAN SEE THIS IS QUITE RIDICULOUS AS AN APPROACH#####-

        */
        handler.handle(request);
    }
}
