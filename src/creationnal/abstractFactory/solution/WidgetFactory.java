package creationnal.abstractFactory.solution;

import creationnal.abstractFactory.Button;
import creationnal.abstractFactory.TextBox;

public interface WidgetFactory {
    Button createButton();
    TextBox createTextBox();
}
