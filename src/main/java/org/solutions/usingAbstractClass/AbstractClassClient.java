package org.solutions.usingAbstractClass;

import org.solutions.singleClass.models.*;
import org.solutions.usingStrategiesPattern.FillInkStrategy.FillInkStrategy;
import org.solutions.usingStrategiesPattern.FillInkStrategy.RefillableStrategy;
import org.solutions.usingStrategiesPattern.Model.PenBody;
import org.solutions.usingStrategiesPattern.Model.PenInk;
import org.solutions.usingStrategiesPattern.Model.PenNib;
import org.solutions.usingStrategiesPattern.WrittingStrategy.RoughWritingStrategy;
import org.solutions.usingStrategiesPattern.WrittingStrategy.WritingStrategy;

public class AbstractClassClient {
    //NOTE : Improvement
    // it helps to avoid LSP as
    // Liskov Substitution Principle is followed since FountainPen does not have a refill, and it throws an exception when changeRefill is called.
    // No field duplication in child classes.
    public static void main(String[] args) {
        Nib nib = new Nib(0.2, NibType.BALL);
        //Ink object
        Ink ink = new Ink("Red", 2, InkType.BALL);


        // create fountain pen which is already
        //RoughWritingStrategy for writting
        // so it is difficult to make it SmoothWrittingStrategy
        // as we need to change class of foundtain pen
        //NOTE 17:
        // PROBLEM: Behaviour is tied to the class hierarchy. Adding a new type of pen requires changing the class hierarchy.
        // hence it violate OCP Priciple
        FountainPen fountainPen = new FountainPen("Abstract Brand ", "Nirmal Fountain Pen", 30.0,
                ink,nib );
        System.out.println(fountainPen.toString());

        //NOTE 13: Problems
        // object creation is complex
        // OCP is violoate as no flexiable of creating any combination
        // of
    }
}
