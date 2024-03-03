package org.solutions.usingAbstractClass;


import lombok.Getter;
import org.solutions.singleClass.models.PenType;
import org.solutions.singleClass.models.Refill;
import org.solutions.usingStrategiesPattern.WrittingStrategy.WritingStrategy;

@Getter
public abstract class RefillablePen extends Pen {

    private Refill refill;

    public RefillablePen(String brand, String name, PenType type, Double price, WritingStrategy writingStrategy,
                         Refill refill) {
        super(brand, name, type, price, writingStrategy);
        this.refill = refill;
    }

    public void changeRefill(Refill refill) {
        if (this.canRefill()) {
            this.refill = refill;
        }
    }

    public abstract Boolean canRefill();

}
