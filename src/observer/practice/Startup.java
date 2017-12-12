package observer.practice;

/**
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        EbayPublisher ebay = new EbayPublisher();
        
        Subscriber buyer = new Buyer();
        Subscriber seller = new Seller();
        
        ebay.addSubscriber(buyer);
        ebay.addSubscriber(seller);
        
        ebay.bidOnProduct("widget", 25);
    }
}
