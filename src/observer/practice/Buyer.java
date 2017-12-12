package observer.practice;

/**
 *
 * @author jlombardo
 */
public class Buyer implements Subscriber {

    @Override
    public void announceBid(String productName, double bid) {
        view(productName, bid);
    }
    
    private void view(String productName, double bid) {
        System.out.println("Buyer views bid on "
                + productName + " in amount of " + bid);
    }
    
}
