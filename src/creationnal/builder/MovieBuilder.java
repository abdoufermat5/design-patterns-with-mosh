package creationnal.builder;

public class MovieBuilder implements PresentationBuilder{
    private MovieDocument document = new MovieDocument();

    @Override
    public void addSlide(Slide slide) {
        document.addPage(slide.getText(), 5);
    }
}
