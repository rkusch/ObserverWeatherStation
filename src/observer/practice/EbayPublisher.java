package observer.practice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jlombardo
 */
public class EbayPublisher {
    private List<Subscriber> subscribers;

    public EbayPublisher() {
        subscribers = new ArrayList<>();
    }
    
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    
    public void bidOnProduct(String productName, double bid) {
        notifySubscribers(productName, bid);
    }
    
    private void notifySubscribers(String productName, double bid) {
        for(Subscriber s : subscribers) {
            s.announceBid(productName, bid);
        }
    }
    
}
