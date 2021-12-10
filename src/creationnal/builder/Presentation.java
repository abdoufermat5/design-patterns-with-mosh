package creationnal.builder;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private List<Slide> slides = new ArrayList<>();

    private void addSlide(Slide slide){
        slides.add(slide);
    }

    public void export(PresentationBuilder builder){
//        switch (format){
//            case PDF:
//                PdfDocument pdf = new PdfDocument();
//                for (Slide slide: slides){
//                    pdf.addPage(slide.getText());
//                }
//                break;
//            case MOVIE:
//                MovieDocument movie = new MovieDocument();
//                for (Slide slide: slides){
//                    movie.addPage(slide.getText(), 3);
//                }
//                break;
//            default:
//                System.out.println("Bye Bye");
//        }
        // Better way
        builder.addSlide(new Slide("Copyright"));
        for(Slide slide: slides){
            builder.addSlide(slide);
        }
    }
}
