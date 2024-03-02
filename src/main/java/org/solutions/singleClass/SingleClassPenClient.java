package org.solutions.singleClass;

import org.solutions.singleClass.models.*;

public class SingleClassPenClient {
    /*  NOTE :
         Problems
         Single Responsibility Principle is violated. There are multiple reasons to change the class such as modifying a single type of pen.
         Open Closed Principle is violated. Adding a new type of pen requires changing the class.
         Null checks are required for handling refill and ink for fountain pens.
         Object creation is complex
     */
    public static void main(String[] args) {
        /*  NOTE 4:
             PROBLEM 1 : creating object is complex as we have to create the object of
            other class like Refill, refilltype, Ink, Nib
                create Nib and Ink object as Refill contains both the
         */
//         Nib object
        Nib nib = new Nib(0.2, NibType.BALL);
        //Ink object
        Ink ink = new Ink("Red", 2, InkType.BALL);

        //create Refill class object
        Refill refill = new Refill(Boolean.TRUE, ink, nib, RefillType.BALL);

        // write through GELL PEN
        Pen pen = new Pen("local", "Nirmal", PenType.GEL, 23.0, refill, RefillType.BALL, ink, nib);
        pen.writeSingle();

    }
}
