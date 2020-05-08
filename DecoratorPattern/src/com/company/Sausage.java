package com.company;

public class Sausage extends ToppingDecorator {

    public Sausage(Pizaa newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return tempPizaa.getDescription() + " + Sausage";
    }

    @Override
    public double getCost() {
        return tempPizaa.getCost() + 1.25;
    }
}
