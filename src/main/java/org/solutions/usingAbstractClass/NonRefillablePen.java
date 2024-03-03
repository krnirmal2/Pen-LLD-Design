package org.solutions.usingAbstractClass;


import lombok.Getter;
import org.solutions.singleClass.models.Ink;
import org.solutions.singleClass.models.Nib;
import org.solutions.singleClass.models.PenType;
import org.solutions.usingStrategiesPattern.WrittingStrategy.WritingStrategy;

@Getter
public abstract class NonRefillablePen extends Pen {

    //NOTE 15: Pen With non refil means ink pen
    // need to ink and nib and also send the writing strategy
    private Ink ink;
    private Nib nib;

    public NonRefillablePen(String brand, String name, PenType type, Double price, WritingStrategy writingStrategy,
                            Ink ink, Nib nib) {
        super(brand, name, type, price, writingStrategy);
        this.ink = ink;
        this.nib = nib;
    }

    public void changeInk(Ink ink) {
        this.ink = ink;
    }

}
