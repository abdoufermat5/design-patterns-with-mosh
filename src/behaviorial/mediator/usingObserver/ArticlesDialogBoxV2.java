package behaviorial.mediator.usingObserver;

public class ArticlesDialogBoxV2 {
    private final ListBoxV2 articlesListBoxV2 = new ListBoxV2();
    private final TextBoxV2 titleTextBoxV2 = new TextBoxV2();
    private final ButtonV2 saveButtonV2 = new ButtonV2();

    public ArticlesDialogBoxV2(){
        articlesListBoxV2.addEventHandler(this::articleSelected);
        titleTextBoxV2.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction(){
        articlesListBoxV2.setSelection("Article 1");
        titleTextBoxV2.setContent("");
        titleTextBoxV2.setContent("Article 2");
        System.out.println("TextBoxV2: " + titleTextBoxV2.getContent());
        System.out.println("ButtonV2: " + saveButtonV2.isEnabled());
    }

    private void articleSelected(){
        titleTextBoxV2.setContent(articlesListBoxV2.getSelection());
        saveButtonV2.setEnabled(true);
    }

    private void titleChanged(){
        String content = titleTextBoxV2.getContent();
        boolean isEmpty = (content == null || content.isEmpty());

        saveButtonV2.setEnabled(!isEmpty);
    }
}
