package com.company;

public class Main {

    public static void main(String[] args) {

    Singleton instance = Singleton.getInstance();
    instance.printusage();
    System.out.println(instance.toString());
    System.out.println(instance.getClass().toString());

    }
}
