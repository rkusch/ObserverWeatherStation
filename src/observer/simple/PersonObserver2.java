package observer.simple;

import java.util.Map;

/**
 * A simple example of an Observer instance. Remember, "observers" act as 
 * "subscribers" to events published by the Observable object, in this case 
 * that is the Person object.
 * 
 * @author Jim
 */
public class PersonObserver2 implements EventObserver {

    /**
     * A common method for all subscriber objects (inherited from
     * EventObserver interface). Notice that the method accepts a data 
     * parameter (optional) that can hold additional information for the 
     * subscriber to act one.
     * @param data 
     */
    @Override
    public void processEvent(Map<String, Object> data) {
        System.out.println("Subscriber notified. Name change event: [old -> "
                + data.get("oldValue") + "] | [new -> " + data.get("newValue") + "]");

    }
}
