package org.solutions.usingInterface.factories;


import org.solutions.usingInterface.GelPen;

public class PenFactory {
    /*
    * This factory method simplifies the creation of GelPen objects by encapsulating
    * the construction logic within the GelPenBuilder returned by the factory. It also promotes separation of concerns by centralizing the creation logic in a separate class (PenFactory).
    * */
    public static GelPen.GelPenBuilder createGelPen() { //returns a builder for creating instances of GelPen
        //NOTE 20:
        // which is accessible without creating an instance of PenFactory.
        // This is a common pattern in factory design where a factory method is used to create objects of a specific type
        System.out.println("Create object for Gel pen from client class");
        return GelPen.builder();

    }

}
