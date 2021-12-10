package structural.bridge;

public class MainTest {
    public static void main(String[] args) {
        RemoteControl rmControl = new RemoteControl(new SamsungTV());
        rmControl.turnOn();
    }
}
