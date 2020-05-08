package momento;

/**
 * @author UMAIR QAYYUM
 *
 */

import java.util.ArrayList;
import java.util.List;

// The list of Objects that have the history from where we can restore contents.
public class Caretaker {
    private List<Momento> states = new ArrayList<>();

    public void push(Momento state){
        states.add(state);
    }

    public  Momento pop(){
        var lastIndex = states.size() -1;
        var lastItem =  (lastIndex < 0) ? null : states.get(lastIndex);
        states.remove(lastItem);
        return lastItem;
    }
}
