package behaviorial.mediator.usingObserver;


public class TextBoxV2 extends UIControlV2 {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }
}
