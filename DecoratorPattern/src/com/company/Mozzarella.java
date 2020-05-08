package com.company;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizaa newPizza) {
        super(newPizza);

    }

    @Override
    public String getDescription() {
        return tempPizaa.getDescription() + " + Mozzarilla cheese";
    }

    @Override
    public double getCost() {
        return tempPizaa.getCost()+0.75;
    }
}
