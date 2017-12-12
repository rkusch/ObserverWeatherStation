/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wife;

import javax.swing.JOptionPane;

/**
 *
 * @author Instlogin
 */
public class Husband implements Subscriber {

    public void update() {
        //System.out.println("Husband says: OK, dear");
        JOptionPane.showMessageDialog(null, "Husband says: OK, dear");
    }
    
}
