package com.company;

public class EagerSingleton {
    /*
    * Simple Implementation
    * Take advantage that static variables are initialized once when the class is first loaded
    *
    * Can west Resources and CPU time if instance is not needed
    * Exception Handling is not possible
    * */
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}
    public static EagerSingleton getInstance(){
        return instance;
    }
}
