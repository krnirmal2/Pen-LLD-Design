package org.solutions.usingStrategiesPattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.solutions.singleClass.models.PenType;
import org.solutions.usingStrategiesPattern.FillInkStrategy.RefillableStrategy;
import org.solutions.usingStrategiesPattern.Model.Pen;
import org.solutions.usingStrategiesPattern.Model.PenBody;
import org.solutions.usingStrategiesPattern.Model.PenInk;
import org.solutions.usingStrategiesPattern.Model.PenNib;
import org.solutions.usingStrategiesPattern.WrittingStrategy.WritingStrategy;
@Getter
@Setter
public class AbstractChildClass extends Pen {
    public AbstractChildClass(PenBody body, PenNib nib, PenInk ink, RefillableStrategy refillableStrategy,WritingStrategy writingStrategy) {
        super("Strategy Brand","Nirmal's Ball Pen",body, nib, ink, PenType.BALL, refillableStrategy,writingStrategy);
    }
    @Override
    public String toString() {
        return "AbstractChildClass{" +
                "Name=" + getName() +
                "Brand=" + getBrand() +
                "body=" + getBody() +
                ", nib=" + getNib() +
                ", ink=" + getInk() +
                '}';
    }
}
