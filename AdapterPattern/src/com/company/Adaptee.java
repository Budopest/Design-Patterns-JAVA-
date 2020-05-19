package com.company;

public class Adaptee {
    // The method signature has changed
    // the variables are reversed so adapter is used
    public void newRequest(String number,String name){
        System.out.println("the new method" );

    }
}
