package behaviorial.observer.pullStyle;


public class DataSourceV3 extends SubjectV3 {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObserverV3();
    }
}
