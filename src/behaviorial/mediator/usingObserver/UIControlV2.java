package behaviorial.mediator.usingObserver;


import java.util.ArrayList;
import java.util.List;

public abstract class UIControlV2 {
    private final List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler){
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandlers(){
        for (EventHandler eventHandler : eventHandlers)
            eventHandler.handle();
    }
}
