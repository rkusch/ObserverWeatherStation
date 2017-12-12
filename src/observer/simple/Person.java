package observer.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import observer.simple1.EventSubscriber;

/**
 * This class is responsible for acting as an Observable (Publisher) object. 
 * It maintains a list of subscribers and notifies each one when an event 
 * happens. Any action we choose can serve as an "event". In this example the 
 * setting a first name or last name triggers an event and notification of 
 * all subscribers.
 * 
 * @author Jim
 */
public class Person {
    private List<EventObserver> subscribers;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        subscribers = new ArrayList<>();
    }

    // Only the publisher should have access to this method
    private void notifySubscribers(Map<String, Object> data) {
        for(EventObserver s : subscribers) {
            s.processEvent(data);
        }
    }
    
    public void addSubscriber(EventObserver subscriber) {
        subscribers.add(subscriber);
    }
    
    public void removeSubscriber(EventObserver subscriber) {
        subscribers.remove(subscriber);
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        Map<String, Object> data = new HashMap<>();
        data.put("oldValue",this.firstName);
        this.firstName = firstName;
        data.put("newValue",firstName);
        notifySubscribers(data);
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        Map<String, Object> data = new HashMap<>();
        data.put("oldValue",this.lastName);
        this.lastName = lastName;
        data.put("newValue",lastName);
        notifySubscribers(data);
    }
}
