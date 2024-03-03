package org.solutions.usingStrategiesPattern.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PenBody {
    private Double length;
    private Double diameter;
    @Override
    public String toString() {
        return "PenInk{" +
                "length='" + length + '\'' +
                " \n diameter='" + diameter + '\'' +
                '}';
    }
}
