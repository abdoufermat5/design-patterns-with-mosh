package behaviorial.observer;

public class SpreedSheet implements Observer{
    @Override
    public void update() {
        System.out.println("SpreadSheet got notified");
    }
}
