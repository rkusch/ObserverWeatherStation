/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.example;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rkusch
 */
public class MathProblemPublisher {
    private List<MathProblemSubscriber> subscribers = new ArrayList<>();
    
    public void addSubscriber(MathProblemSubscriber s) {
        subscribers.add(s);
    }
    
    public void removeSubscriber(MathProblemSubscriber s) {
        subscribers.remove(s);
    }
    
    public void square(double number) {
        String problem = "Square a number" + number;
        double answer = number * number;
        notifySubscribers(problem,answer);
        
    
}
    
        public void add(double number1, double number2) {
        String problem = "Add numbers: " + number1 + " " + number2;
        double answer = number1 + number2;
        notifySubscribers(problem,answer);
        
    
}
    
private void notifySubscribers(String problem, double answer) {
    for (MathProblemSubscriber s : subscribers) {
        s.processEvent(problem,answer);
        
    }

}


}