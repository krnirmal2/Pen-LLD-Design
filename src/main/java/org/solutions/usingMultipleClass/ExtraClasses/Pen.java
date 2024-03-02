package org.solutions.usingMultipleClass.ExtraClasses;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.solutions.singleClass.models.PenType;
import org.solutions.singleClass.models.Refill;

@Getter
@AllArgsConstructor
public abstract class Pen {
    private String brand;
    private String name;
    private PenType type;
    private Double price;

    public abstract void write();

    public abstract void changeRefill(Refill refill);

}
