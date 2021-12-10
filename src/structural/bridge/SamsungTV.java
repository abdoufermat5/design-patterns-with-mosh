package structural.bridge;

public class SamsungTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Sony: turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turn Off");
    }

    @Override
    public void senChannel(int number) {
        System.out.println("Sony: setChannel");
    }
}
