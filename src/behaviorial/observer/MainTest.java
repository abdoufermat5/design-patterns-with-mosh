package behaviorial.observer;

public class MainTest {
    public static void main(String[] args) {
        DataSource ds = new DataSource();
        SpreedSheet sheet1 = new SpreedSheet();
        SpreedSheet sheet2 = new SpreedSheet();
        Chart chart = new Chart();

        ds.addObserver(sheet1);
        ds.addObserver(sheet2);
        ds.addObserver(chart);

        ds.setValue(15);
    }
}
