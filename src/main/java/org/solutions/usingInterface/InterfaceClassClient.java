package org.solutions.usingInterface;

import org.solutions.singleClass.models.*;
import org.solutions.usingInterface.factories.PenFactory;
import org.solutions.usingStrategiesPattern.WrittingStrategy.SmoothWritingStrategy;

public class InterfaceClassClient {
    //   NOTE 21:
    // Implement Pen using Interface and builder design pattern for
    // creating object so the LSP and object creation complexity is resolved
    public static void main(String[] args) {
        Nib nib = new Nib(0.2, NibType.BALL);
        // Ink object
        Ink ink = new Ink("Red", 2, InkType.BALL);
        // Refill object for Gel pen
        Refill refill = new Refill(true, ink, nib, RefillType.GELL);

        //NOTE 21 :
        //  Create object for GEl pen class
        //  USNG FACTORY DESIGN PATTERN
        var gelpenFactory = PenFactory.createGelPen();
        gelpenFactory.refill(refill);

        Pen gelPen = gelpenFactory.name("Nirmal's gelPen").brand("Interface Brand").price(29.0)
                .type(PenType.GEL).writingStrategy(new SmoothWritingStrategy()).build();
        // Gelpen write smoothly
        gelPen.getWritingStrategy().write();
    }
}
