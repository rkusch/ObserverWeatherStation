/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.example;

import javax.swing.JOptionPane;

/**
 *
 * @author rkusch
 */
public class GuiOutputSubscriber implements MathProblemSubscriber {

    @Override
    public void processEvent(String problem, double answer) {
        
        JOptionPane.showMessageDialog(null, "The answer the the problem is" + problem + ": is " + answer);
    }
    
}
