package org.solutions.usingMultipleClass.ExtraClasses;

import lombok.Getter;
import org.solutions.singleClass.models.PenType;
import org.solutions.singleClass.models.Refill;

@Getter
public class GelPen extends Pen {
    private Refill refill;

    public GelPen(String brand, String name, Double price, Refill refill) {
        super(brand, name, PenType.GEL, price);
        this.refill = refill;
    }
    @Override
    public void write() {
        System.out.println("Writing with Gel Pen");
    }

    @Override
    public void changeRefill(Refill refill) {
        if (this.refill.getRefillable()) {
            this.refill = refill;
            System.out.println("Refill of Gel pen changed Successfully ..");
        }
    }

}
