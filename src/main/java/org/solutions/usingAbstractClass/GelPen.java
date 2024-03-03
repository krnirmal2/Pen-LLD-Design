package org.solutions.usingAbstractClass;


import org.solutions.singleClass.models.PenType;
import org.solutions.singleClass.models.Refill;
import org.solutions.usingStrategiesPattern.WrittingStrategy.SmoothWritingStrategy;

public class GelPen extends RefillablePen {

    public GelPen(String brand, String name, Double price,
            Refill refill) {
        super(brand, name, PenType.GEL, price, new SmoothWritingStrategy(), refill);
    }

    @Override
    public Boolean canRefill() {
        return getRefill().getRefillable();
    }

}
