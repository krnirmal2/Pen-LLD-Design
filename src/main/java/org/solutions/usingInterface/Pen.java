package org.solutions.usingInterface;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import org.solutions.singleClass.models.PenType;
import org.solutions.usingStrategiesPattern.WrittingStrategy.WritingStrategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Builder;
/*

@Getter
@AllArgsConstructor
@Builder

public abstract class Pen {
    //NOTE 18:
    // Basic Pen structure
    private String brand;
    private String name;
    private PenType type;
    private Double price;
    private WritingStrategy writingStrategy;

    public void write() {
        writingStrategy.write();
    }

    // Abstract method for subclasses to implement
    public abstract void refill();

    // Builder class for Pen
    public static class PenBuilder {
        private String brand;
        private String name;
        private PenType type;
        private Double price;
        private WritingStrategy writingStrategy;

        public PenBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public PenBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PenBuilder type(PenType type) {
            this.type = type;
            return this;
        }

        public PenBuilder price(Double price) {
            this.price = price;
            return this;
        }

        public PenBuilder writingStrategy(WritingStrategy writingStrategy) {
            this.writingStrategy = writingStrategy;
            return this;
        }

        public Pen build() {
            return new ConcretePen(brand, name, type, price, writingStrategy);
        }
    }
}




*/


@Getter
@AllArgsConstructor
@SuperBuilder
public abstract class Pen {
    //NOTE 19: create Basic structure with
    private String brand;
    private String name;
    private PenType type;
    private Double price;
    private WritingStrategy writingStrategy;

    public void write() {
        System.out.println("Pen class Write() method called to implement strategy pattern ");
        writingStrategy.write();
    }

}
