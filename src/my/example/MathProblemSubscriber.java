/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.example;

/**
 *
 * @author rkusch
 */
public interface MathProblemSubscriber {
    
    public abstract void processEvent(String problem, double answer);
    
}
