package org.solutions.usingStrategiesPattern.FillInkStrategy;


import org.solutions.usingStrategiesPattern.Model.Pen;

public interface RefillableStrategy {
    //NOTE 11: this interface help to choose the
    // refilling choice to the client
    public void refill();
}
