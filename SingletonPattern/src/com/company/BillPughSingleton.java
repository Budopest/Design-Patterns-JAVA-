package com.company;

public class BillPughSingleton {
    /*
    * Using inner static class for initialization
    * When class is loaded inner class is not loaded
    * When getInstance gets invoked instance will be initialized
    * So its lazy initialization
    *
    * */
    private BillPughSingleton(){}
    private static class InnerSingleton{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return InnerSingleton.instance;
    }
    public void printUsage(){
        System.out.println("Bill Pugh Singleton function is up and running");
    }

}
