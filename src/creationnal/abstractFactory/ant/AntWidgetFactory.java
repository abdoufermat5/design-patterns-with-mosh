package creationnal.abstractFactory.ant;

import creationnal.abstractFactory.Button;
import creationnal.abstractFactory.TextBox;
import creationnal.abstractFactory.material.MaterialButton;
import creationnal.abstractFactory.material.MaterialTextBox;
import creationnal.abstractFactory.solution.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
