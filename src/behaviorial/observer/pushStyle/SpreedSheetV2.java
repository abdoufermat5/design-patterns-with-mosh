package behaviorial.observer.pushStyle;

public class SpreedSheetV2 implements ObserverV2 {
    @Override
    public void update(int value) {
        System.out.println("SpreadSheet got notified: "+value);
    }
}
