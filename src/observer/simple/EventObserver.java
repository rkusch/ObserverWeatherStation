package observer.simple;

import java.util.Map;

/**
 * This is the general contract for all subscribers (observers) to the 
 * event publisher (Observable), which in this example is the Person object.
 * 
 * @author jlombardo
 */
public interface EventObserver {
    public abstract void processEvent(Map<String, Object> data);
}
