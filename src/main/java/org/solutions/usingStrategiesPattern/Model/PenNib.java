package org.solutions.usingStrategiesPattern.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PenNib {
    private Double diameter;
    @Override
    public String toString() {
        return "PenNib{" +
                "diameter=" + diameter +
                '}';
    }
}
