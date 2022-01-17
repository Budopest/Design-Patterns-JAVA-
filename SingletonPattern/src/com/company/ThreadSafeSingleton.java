package com.company;

public class ThreadSafeSingleton {
    /*
    *  To make it thread safe you can synchronize getInstance but this will be poor performance
    *  synchronized public static ThreadSafeSingleton getInstance()
    *
    * instance should be declared volatile
    * Double check locking can be used to improve performance
    * */
    private volatile static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getInstance(){
        if(instance==null){
            synchronized (ThreadSafeSingleton.class){
                if (instance==null) instance = new ThreadSafeSingleton();
            }

        }
        return instance;
    }


}
