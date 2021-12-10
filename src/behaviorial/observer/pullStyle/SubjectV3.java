package behaviorial.observer.pullStyle;



import java.util.ArrayList;
import java.util.List;

// The Observable
public class SubjectV3 {
    private final List<ObserverV3> observers = new ArrayList<>();
    public void addObserverV3(ObserverV3 observer){
        observers.add(observer);
    }
    public void removeObserverV3(ObserverV3 observer){
        observers.remove(observer);
    }
    public void notifyObserverV3(){
        for (ObserverV3 observer: observers)
            observer.update();
    }
}
