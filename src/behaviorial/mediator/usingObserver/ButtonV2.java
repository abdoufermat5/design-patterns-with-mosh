package behaviorial.mediator.usingObserver;


public class ButtonV2 extends UIControlV2 {
    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }
}
