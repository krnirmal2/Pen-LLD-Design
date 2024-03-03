package org.solutions.usingStrategiesPattern.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.solutions.singleClass.models.PenType;
import org.solutions.usingStrategiesPattern.FillInkStrategy.RefillableStrategy;
import org.solutions.usingStrategiesPattern.WrittingStrategy.WritingStrategy;

@Getter
@Setter
@AllArgsConstructor
public abstract class Pen {
    private String Brand;
    private String name;
    private PenBody body;
    private PenNib nib;
    private PenInk ink;
    private PenType penType;

    private RefillableStrategy refillableStrategy;
    private WritingStrategy writingStrategy;


    }
