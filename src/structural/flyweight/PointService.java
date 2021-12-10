package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory iconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        Point point = new Point(2, 7, iconFactory.getPointIcon(PointType.HOSPITAL));
        Point point2 = new Point(6, 8, iconFactory.getPointIcon(PointType.MOTEL));
        points.add(point);
        points.add(point2);

        return points;
    }
}
