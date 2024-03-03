package org.solutions.usingInterface;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.solutions.singleClass.models.PenType;
import org.solutions.singleClass.models.Refill;
import org.solutions.usingInterface.interfaces.RefillPen;
import org.solutions.usingStrategiesPattern.WrittingStrategy.SmoothWritingStrategy;
@Getter
@Setter
@SuperBuilder
public class GelPen extends Pen implements RefillPen {

    private Refill refill;

    public GelPen(String brand, String name, Double price, Refill refill) {
        super(brand, name, PenType.GEL, price, new SmoothWritingStrategy());
        this.refill = refill;
    }

    @Override
    public void changeRefill(Refill refill) {
        if (this.canRefill()) {
            this.refill = refill;
        }
    }

    @Override
    public Boolean canRefill() {
        return getRefill().getRefillable();
    }

    @Override
    public Refill getRefill() {
        return refill;
    }

  /*  @Override
    public void refill() {
        System.out.println("refill in Gel pen ");

    }*/
}