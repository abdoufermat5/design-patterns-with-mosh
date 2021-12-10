package behaviorial.observer.pushStyle;


import java.util.ArrayList;
import java.util.List;

// The Observable
public class SubjectV2 {
    private final List<ObserverV2> observers = new ArrayList<>();
    public void addObserverV2(ObserverV2 observer){
        observers.add(observer);
    }
    public void removeObserverV2(ObserverV2 observer){
        observers.remove(observer);
    }
    public void notifyObserverV2(int value){
        for (ObserverV2 observer: observers)
            observer.update(value);
    }
}
