package behaviorial.mediator.usingObserver;


public class ListBoxV2 extends UIControlV2 {
    private String selection;

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyEventHandlers();
    }
}
