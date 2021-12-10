package behaviorial.template.more;

public abstract class FigureArea {
    public void calculateArea(){

        int[] edges = doGetEdges();
        int area = doCalculate();
        System.out.println("area: "+area);
    }

    protected abstract int doCalculate();

    protected abstract int[] doGetEdges();
}
