package com.company;

public class LazySingleton {
    /*
    * Lazy initialization only when needed
    * Exceptions can be handleded
    * Multithreading can break the singleton property
    * */

    private static LazySingleton instance;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if(instance==null) instance = new LazySingleton();
        return instance;
    }
    public void printUsage(){
        System.out.println("LazySingleton function is up and running");
    }

}
