package DesignPatterns.DecoratorPattern;

public class PeppyPanner extends Pizza {


    public PeppyPanner(){
        description = "PeppyPanner";
    }
    @Override
    public int getCost() {
        return 100;
    }
}
