package creationnal.abstractFactory.material;

import creationnal.abstractFactory.Button;
import creationnal.abstractFactory.TextBox;
import creationnal.abstractFactory.solution.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
