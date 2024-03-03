package org.solutions.usingStrategiesPattern.FillInkStrategy;


import lombok.AllArgsConstructor;
import org.solutions.usingStrategiesPattern.Model.Pen;

@AllArgsConstructor
public class FillInkStrategy implements RefillableStrategy {

    @Override
    public void refill() {
        System.out.println("Refill using ink strategy: ");

    }
    
}
