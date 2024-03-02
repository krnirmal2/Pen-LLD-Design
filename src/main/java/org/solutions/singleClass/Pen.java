package org.solutions.singleClass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.solutions.singleClass.models.*;

@Getter
//@AllArgsConstructor
public class Pen {
/*
    NOTE :
     PROBLEM 2 : Single Responsibility Principle is violated. There are multiple reasons to change the class
      such as modifying a single type of pen.
   */
    //  Note 1 : Single clas define everything
    private final String brand;
    private final String name;

    //NOTE 2:  add different pen penType GEL ,Ball ,Throwaway etc
    private final PenType penType;
    private final Double price;
    //NOTE 3:  add different Reefil and refile penType
    private final Refill refill;
    private final RefillType refillType;

    private final Ink ink;
    private final Nib nib;

    public Pen(String brand, String name, PenType penType, Double price, Refill refill, RefillType refillType, Ink ink, Nib nib) {
        this.brand = brand;
        this.name = name;
        this.penType = penType;
        this.price = price;
        this.refill = refill;
        this.refillType = refillType;
        this.ink = ink;
        this.nib = nib;
    }

    public void writeSingle() {
        switch (penType) {
            case GEL:
                System.out.println("Gel Pen writes");
                break;
            case BALL:
                System.out.println("Ball Pen writes");
                break;
            case FOUNTAIN:
                System.out.println("Fountain Pen writes");
                break;
            case MARKER:
                System.out.println("Marker Pen writes");
                break;
            case THROW_AWAY:
                System.out.println("Throwaway Pen writes");
                break;
        }

    }

}