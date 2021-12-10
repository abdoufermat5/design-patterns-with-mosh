package behaviorial.template.more;

public class Rectangle extends FigureArea{
    protected int[] a;
    @Override
    protected int doCalculate() {
        return a[0]*a[1];
    }

    @Override
    protected int[] doGetEdges() {
        a = new int[]{15, 20};
        return a;
    }
}
