package org.solutions.singleClass.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Nib {
    private double radius;
    private NibType type;
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nib{");
        sb.append("radius=").append(radius);
        sb.append(", NibType=").append(type);
        sb.append("}");
        return sb.toString();
    }

}
