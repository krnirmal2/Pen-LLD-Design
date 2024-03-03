package org.solutions.usingAbstractClass;



import org.solutions.singleClass.models.Nib;
import org.solutions.singleClass.models.Ink;
import org.solutions.singleClass.models.PenType;
import org.solutions.usingStrategiesPattern.WrittingStrategy.RoughWritingStrategy;
public class FountainPen extends NonRefillablePen {

    //NOTE 16: When we create the pen we can pass
    // the writting strategy and is it need to Refilable or not
    // With Basic Pen Structure from "Pen" class
    public FountainPen(String brand, String name, Double price, Ink ink,
            Nib nib) {
        super(brand, name, PenType.FOUNTAIN, price, new RoughWritingStrategy(), ink, nib);
    }
    @Override
    public String toString() {
        return "FountainPen{" +
                "brand='" + getBrand() + '\'' +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", ink=" + getInk() +
                ", nib=" + getNib() +
                '}';
    }

}
