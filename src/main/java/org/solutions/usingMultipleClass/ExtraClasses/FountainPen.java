package org.solutions.usingMultipleClass.ExtraClasses;

import lombok.Getter;
import org.solutions.singleClass.models.Ink;
import org.solutions.singleClass.models.Nib;
import org.solutions.singleClass.models.PenType;
import org.solutions.singleClass.models.Refill;

@Getter
public class FountainPen extends Pen {
    //NOTE 5:
    // create separte class for each type of pen
    // which remove SRP violation
    //Each pen have its own ink and nib
    // and other property taken from its parent

    private Ink ink;
    private final Nib nib;

    public FountainPen(String brand, String name, Double price, Ink ink, Nib nib) {
        //NOTE 6: take from parent class Pen as it extends
        super(brand, name, PenType.FOUNTAIN, price);
        this.ink = ink;
        this.nib = nib;
    }

    @Override
    public void write() {
        System.out.println("Writing with Fountain Pen");
    }

    @Override
    public void changeRefill(Refill refill) {
        //NOTE 7:
        // Violating Liskov Substitution Principle (LSP)  , as it advertise what it can't do
        // means it will throw expection on runtime not in compile time
        throw new UnsupportedOperationException("Fountain Pen cannot be refilled" +
                "  : Liskov Substitution Principle (LSP) ");
    }

    public void changeInk(Ink ink) {
        this.ink = ink;
    }

}
