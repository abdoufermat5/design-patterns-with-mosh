package structural.adapter;

import structural.adapter.avaFilters.Caramel;

public class MainTest {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new CaramelAdapter());
    }
}
