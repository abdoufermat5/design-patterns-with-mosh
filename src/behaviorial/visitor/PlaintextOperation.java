package behaviorial.visitor;

public class PlaintextOperation implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("remove-heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("remove-anchor");
    }
}
