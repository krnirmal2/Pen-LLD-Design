package org.solutions.usingStrategiesPattern.WrittingStrategy;

import org.solutions.usingStrategiesPattern.Model.Pen;

public interface WritingStrategy {

    //NOTE 12:
    // this will help to choose in which way a pen should write
    public void write();
}
