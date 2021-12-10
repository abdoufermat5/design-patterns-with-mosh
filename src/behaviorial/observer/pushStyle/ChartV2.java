package behaviorial.observer.pushStyle;

public class ChartV2 implements ObserverV2 {
    @Override
    public void update(int value) {
        System.out.println("Chart got updated: "+value);
    }
}
