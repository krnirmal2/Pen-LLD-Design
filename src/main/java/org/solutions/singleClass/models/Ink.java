package org.solutions.singleClass.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Ink {
    private String color;
    private int quantity;
    private InkType type;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ink{");
        sb.append("color=").append(color);
        sb.append(", quantity=").append(quantity);
        sb.append(", type=").append(type);
        // Append other fields as needed
        sb.append("}");
        return sb.toString();
    }
}
