package com.company;

public class Main {

    public static void main(String[] args) {

    LazySingleton instance = LazySingleton.getInstance();
    instance.printUsage();
    System.out.println(instance.toString());
    System.out.println(instance.getClass().toString());

    }
}
