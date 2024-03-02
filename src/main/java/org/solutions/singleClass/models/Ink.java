package org.solutions.singleClass.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Ink {
    private String color;
    private int quantity;
    private InkType type;
}
