package com.company;

public class EagerSingletonV2 {
    /*
    * use static block to initialize
    * This allow for Exception Handling
    * Stil can waste resources
    * */
    private static EagerSingletonV2 instance;
    static {
        try {
            instance = new EagerSingletonV2();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private EagerSingletonV2() throws Exception{}
    public static EagerSingletonV2 getInstance(){
        return instance;
    }

}
