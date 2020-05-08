package com.company;

public class Main {

    public static void main(String[] args) {

        Pizaa sausagePizza = new Sausage(new TomatoeSauce(new Mozzarella(new PlainPizza())));
        System.out.println("The ordered pizza description: " + sausagePizza.getDescription() + "\n" +
                            "The total price: " + sausagePizza.getCost() + "\n");

    }
}
