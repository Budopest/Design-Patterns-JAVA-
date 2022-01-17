package com.company;

public class EagerSingelton {
    /*
    * Simple Implementation
    * Take advantage that static variables are initialized once when the class is first loaded
    *
    * Can west Resources and CPU time if instance is not needed
    * Exception Handling is not possible
    * */
    private static final EagerSingelton instance = new EagerSingelton();
    private EagerSingelton(){}
    public static EagerSingelton getInstance(){
        return instance;
    }
}
