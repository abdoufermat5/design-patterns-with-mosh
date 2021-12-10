package structural.facade;

public class NotificationService {
    public void send(String message, String target){
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("ip");
        AuthToken token = server.authenticate("appId", "key");
        Message msg = new Message(message);
        server.send(token, msg, target);
        connection.disconnect();
    }
}
