package org.solutions.usingInterface;


import lombok.Getter;
import org.solutions.singleClass.models.Ink;
import org.solutions.singleClass.models.Nib;
import org.solutions.singleClass.models.PenType;
import org.solutions.usingStrategiesPattern.WrittingStrategy.SmoothWritingStrategy;

@Getter
public class FountainPen extends Pen {
    private Ink ink;
    private Nib nib;

    public FountainPen(String brand, String name, Double price, Ink ink, Nib nib) {
        super(brand, name, PenType.GEL, price, new SmoothWritingStrategy());
        this.ink = ink;
        this.nib = nib;
        System.out.println("Fountain pen constructor Called which extends Pen Abstract class");
    }

    public void changeInk(Ink ink) {
        System.out.println("Fountain changeInk Method  which set ink to the fountain pen ;");
        this.ink = ink;
    }

    @Override
    public String toString() {
        return "FountainPen{" +
                "brand='" + getBrand() + '\'' +
                ", name='" + getName() + '\'' +
                ", type=" + getType() +
                ", price=" + getPrice() +
                ", ink=" + ink +
                ", nib=" + nib +
                '}';
    }
}
