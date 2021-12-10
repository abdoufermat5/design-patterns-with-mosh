package structural.adapter;

public class VividFilter implements Filter{
    @Override
    public void apply(Image img) {
        System.out.println("Vivid filter applied");
    }
}
