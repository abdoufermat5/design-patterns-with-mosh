package behaviorial.observer.pullStyle;


public class ChartV3 implements ObserverV3 {
    private DataSourceV3 dataSource;

    public ChartV3(DataSourceV3 dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart got updated: "+dataSource.getValue());
    }
}
