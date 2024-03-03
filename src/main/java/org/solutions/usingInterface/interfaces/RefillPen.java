package org.solutions.usingInterface.interfaces;


import org.solutions.singleClass.models.Refill;

public interface RefillPen {

    public void changeRefill(Refill refill);

    public Boolean canRefill();

    public Refill getRefill();
}
