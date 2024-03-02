package org.solutions.usingMultipleClass.ExtraClasses;


import org.solutions.singleClass.models.*;

public class MultipleClassPenClient {
    /*  NOTE 7:
         Improvement from Single class to Multiple clas
         Single Responsibility Principle is followed. Each class has a single responsibility.
        Open Closed Principle is followed. Adding a new type of pen does not require changing the class.
        Null checks are not required for handling refill and ink for fountain pens.

     */
    public static void main(String[] args) {
        /*  NOTE 8:
             PROBLEMS : Object creation is still complex
                Liskov Substitution Principle is violated since FountainPen does not have a refill, and it throws an exception when changeRefill is called.
                Code duplication
                Subclasses are used to create objects.
         */
       //   Nib object
        Nib nib = new Nib(0.2, NibType.BALL);
        //Ink object
        Ink ink = new Ink("Red", 2, InkType.BALL);

        //create Refill class object
        Refill refill = new Refill(Boolean.TRUE, ink, nib, RefillType.BALL);

        // create Fountain Pen which require Ink and Nib not refil
        FountainPen fountainPen = new FountainPen("localFountain"
        ,"nirmal's Fountain Pen",10.0,ink,nib);
        fountainPen.write();

        try{
            // NOTE 9: Give LSP Violation,
            fountainPen.changeRefill(refill);
        }catch (Exception e){
            System.out.println("Got exception of , please remove try and catch" +
                    "to see error LSP VIOLATION");
        }

        // Create GelPen which require Refil not ink and nib
        GelPen gelPen = new GelPen("local Gel"
                ,"nirmal's Gel Pen",20.0,refill);
        gelPen.write();
        gelPen.changeRefill(refill);

    }
}
