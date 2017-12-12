package wife;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Instlogin
 */
public class Wife {
    private List<Subscriber> subscribers = new ArrayList<Subscriber>();
    
    public void addSubscriber(Subscriber s) {
        subscribers.add(s);
    }
    
    public void removeSubscriber(Subscriber s) {
        subscribers.remove(s);
    }
    
    public void takeOutGarbage() {
        // do other work
        notifySubscribers();
    }
    
    private void notifySubscribers() {
        for(Subscriber s : subscribers) {
            s.update();
        }
    }
}
