package com.company;

public class EagerSingeltonV2 {
    /*
    * use static block to initialize
    * This allow for Exception Handling
    * Stil can waste resources
    * */
    private static EagerSingeltonV2 instance;
    static {
        try {
            instance = new EagerSingeltonV2();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private EagerSingeltonV2() throws Exception{}
    public static EagerSingeltonV2 getInstance(){
        return instance;
    }

}
