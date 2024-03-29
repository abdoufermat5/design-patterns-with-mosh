package structural.flyweight;

public class Point {
    private int x;
    private int y;
    private PointIcon icon;

    public Point(int x, int y, PointIcon pi) {
        this.x = x;
        this.y = y;
        this.icon = pi;
    }

    public void draw(){
        System.out.printf("%s at (%d, %d) \n", icon.getType(), x, y);
    }
}
