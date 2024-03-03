package org.solutions.usingStrategiesPattern.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PenInk {
    private String inkColour;
    @Override
    public String toString() {
        return "PenInk{" +
                "inkColour='" + inkColour + '\'' +
                '}';
    }
}
