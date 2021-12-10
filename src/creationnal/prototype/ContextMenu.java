package creationnal.prototype;

public class ContextMenu {
    public void duplicate(Component component) {
        Component newC = component.clone();
        newC.render();
    }
}
