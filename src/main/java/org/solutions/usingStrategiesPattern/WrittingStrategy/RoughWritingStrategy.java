package org.solutions.usingStrategiesPattern.WrittingStrategy;

import org.solutions.usingStrategiesPattern.Model.Pen;

public class RoughWritingStrategy implements WritingStrategy {
    @Override
    public void write() {
        System.out.println("Writing roughly");
    }

}
