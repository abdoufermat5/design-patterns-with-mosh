package behaviorial.observer.pullStyle;


public class SpreedSheetV3 implements ObserverV3 {
    private DataSourceV3 dataSource;

    public SpreedSheetV3(DataSourceV3 dataSource) {
        this.dataSource = dataSource;
    }



    @Override
    public void update() {
        System.out.println("SpreadSheet got notified: "+dataSource.getValue());
    }
}
