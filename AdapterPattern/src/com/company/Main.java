package com.company;

public class Main {

    public static void main(String[] args) {

        Itarget itarget = new Adapter(new Adaptee());
        itarget.request("name","number");

    }
}
