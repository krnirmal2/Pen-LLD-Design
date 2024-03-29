package org.solutions.usingStrategiesPattern.WrittingStrategy;

import lombok.AllArgsConstructor;
import org.solutions.usingStrategiesPattern.Model.Pen;
@AllArgsConstructor
public class SmoothWritingStrategy implements WritingStrategy {
    @Override
    public void write() {
        System.out.println("Writing smoothly");
    }
}
