package com.company;

public abstract class ToppingDecorator extends Pizaa {

    protected Pizaa tempPizaa;
    public ToppingDecorator(Pizaa newPizza){
        this.tempPizaa = newPizza;
    }
    public abstract String getDescription();
    public abstract double getCost();

}
