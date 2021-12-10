package behaviorial.observer.pushStyle;


public class DataSourceV2 extends SubjectV2 {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObserverV2(value);
    }
}
