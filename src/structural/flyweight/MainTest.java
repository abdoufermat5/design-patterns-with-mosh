package structural.flyweight;

public class MainTest {
    public static void main(String[] args) {
        PointService ps = new PointService(new PointIconFactory());

        for(Point point: ps.getPoints())
            point.draw();
    }
}
