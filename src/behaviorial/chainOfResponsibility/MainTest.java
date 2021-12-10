package behaviorial.chainOfResponsibility;

public class MainTest {
    public static void main(String[] args) {
        // Chain : authenticator -> logger -> compressor - encryptor

        Encryptor encryptor = new Encryptor(null);
        Compressor compressor = new Compressor(encryptor);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);

        WebServer server = new WebServer(authenticator);
        HttpRequest request = new HttpRequest("admin", "1234");
        server.handle(request);
    }
}
