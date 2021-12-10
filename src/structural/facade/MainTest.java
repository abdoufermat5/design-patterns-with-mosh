package structural.facade;

public class MainTest {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.send("Hello dear friends", "friends");
    }
}
