package com.company;

public class TomatoeSauce extends ToppingDecorator {
    public TomatoeSauce(Pizaa newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return tempPizaa.getDescription() + " + Tomatoe Sauce";
    }

    @Override
    public double getCost() {
        return tempPizaa.getCost() + 0.5;
    }
}
