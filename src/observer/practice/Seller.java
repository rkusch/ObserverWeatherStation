package observer.practice;

/**
 *
 * @author jlombardo
 */
public class Seller implements Subscriber {

    @Override
    public void announceBid(String productName, double bid) {
        if(bid < 10) {
            System.out.println("Seller says " + bid + 
                    " is low");
        } else {
            System.out.println("Seller says " + bid + 
                    " is high");
        }
    }
    
}
