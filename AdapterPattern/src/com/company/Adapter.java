package com.company;

public class Adapter implements Itarget{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
                this.adaptee = adaptee;
    }

    @Override
    public void request(String name, String number) {
        this.adaptee.newRequest(number,name);
    }
}
