package structural.adapter;

import structural.adapter.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter{
    @Override
    public void apply(Image img) {
        init();
        render(img);
    }
}
