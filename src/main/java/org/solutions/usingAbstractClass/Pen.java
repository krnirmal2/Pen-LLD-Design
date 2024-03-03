package org.solutions.usingAbstractClass;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.solutions.singleClass.models.PenType;
import org.solutions.usingStrategiesPattern.WrittingStrategy.WritingStrategy;

@Getter
@AllArgsConstructor
public abstract class Pen {
    //NOTE 14: Basic Pen structure
    private String brand;
    private String name;
    private PenType type;
    private Double price;
    private WritingStrategy writingStrategy;

    // where write method is with writingStrategy
    public void write() {
        writingStrategy.write();
    }

}