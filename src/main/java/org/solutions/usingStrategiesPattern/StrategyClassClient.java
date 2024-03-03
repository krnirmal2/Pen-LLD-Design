package org.solutions.usingStrategiesPattern;


import org.solutions.usingStrategiesPattern.FillInkStrategy.FillInkStrategy;
import org.solutions.usingStrategiesPattern.FillInkStrategy.RefillableStrategy;
import org.solutions.usingStrategiesPattern.Model.PenBody;
import org.solutions.usingStrategiesPattern.Model.PenInk;
import org.solutions.usingStrategiesPattern.Model.PenNib;
import org.solutions.usingStrategiesPattern.WrittingStrategy.RoughWritingStrategy;
import org.solutions.usingStrategiesPattern.WrittingStrategy.WritingStrategy;

public class StrategyClassClient  {
    //NOTE 10:
    // Use Strategy design pattern to reduce duplicate code for each
    // each pen creation
    // using refilable and Writting strategy we can
    // create multiple pen of our choice
    public static void main(String[] args) {
        //NOTE
        PenBody penBody = new PenBody(13.0,2.0);
        PenNib penNib = new PenNib(1.0);
        PenInk penInk = new PenInk("Black");
        // RefilableStretegy
        RefillableStrategy refilableStretegy = new FillInkStrategy();

        WritingStrategy writingStrategy = new RoughWritingStrategy();
//        Pen pen = new Pen(penBody,penNib,penInk,refilableStretegy,writingStrategy);

        AbstractChildClass abstractChildClass = new AbstractChildClass(penBody,penNib,penInk,refilableStretegy,writingStrategy);
        abstractChildClass.setWritingStrategy(writingStrategy);

        abstractChildClass.setRefillableStrategy(refilableStretegy);
        abstractChildClass.getWritingStrategy().write();
        abstractChildClass.getRefillableStrategy().refill();

        System.out.println(abstractChildClass.toString());
        System.out.println("Completed");
    }


}
