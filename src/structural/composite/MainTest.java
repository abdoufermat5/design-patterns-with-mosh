package structural.composite;

public class MainTest {
    public static void main(String[] args) {
        Group group1 = new Group();

        group1.add(new Shape());
        group1.add(new Shape());

        Group group2 = new Group();

        group2.add(new Shape());
        group2.add(new Shape());

        Group groups = new Group();
        groups.add(group1);
        groups.add(group2);

        groups.render();
        groups.move();
    }
}
