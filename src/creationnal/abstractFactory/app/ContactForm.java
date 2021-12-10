package creationnal.abstractFactory.app;

import creationnal.abstractFactory.Theme;
import creationnal.abstractFactory.ant.AntButton;
import creationnal.abstractFactory.ant.AntTextBox;
import creationnal.abstractFactory.material.MaterialButton;
import creationnal.abstractFactory.material.MaterialTextBox;
import creationnal.abstractFactory.solution.WidgetFactory;

public class ContactForm {
    // OCP violated: we hve to modify this class for extension
    public void render(WidgetFactory factory){
        // Best Way
        factory.createTextBox();
        factory.createButton();

        // Bad Way
        /*if (theme == Theme.ANT){
            new AntTextBox().render();
            new AntButton().render();
        }else if(theme == Theme.MATERIAL){
            new MaterialTextBox().render();
            new MaterialButton().render();
        }*/
    }
}
