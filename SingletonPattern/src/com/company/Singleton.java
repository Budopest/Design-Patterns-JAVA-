package com.company;

public class Singleton {

    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance==null) instance = new Singleton();
        return instance;
    }
    public void printusage(){
        System.out.println("Singleton function is up and running");
    }

}
