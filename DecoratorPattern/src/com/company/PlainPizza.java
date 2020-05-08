package com.company;

public class PlainPizza extends Pizaa {
    @Override
    public String getDescription() {
        return "Thin dough pizza";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
