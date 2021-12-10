package behaviorial.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList();

    public void push(EditorState state){
        states.add(state);
    }

    public EditorState pop(){
        int lastStateIndex = states.size() - 1;
        if(lastStateIndex>0) {
            EditorState lastState = states.get(lastStateIndex);
            states.remove(lastState);

            return lastState;
        }else{
            return states.get(0);
        }
    }
}
