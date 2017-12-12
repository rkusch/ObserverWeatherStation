package observer.practice;

/**
 *
 * @author jlombardo
 */
public interface Subscriber {
    public abstract void announceBid(String productName, double bid);
}
