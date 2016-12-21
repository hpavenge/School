package com.example.nbsm.headfirstdesignbook2.chapt5Singleton;

/**
 * Created by nbsm on 21-12-2016.
 */

public class Singleton {
    // static variable so it can hold only one instance of the class Singleton
    private static Singleton uniqueInstance = new Singleton();
    // if used in threading instatiate it over here

    // private constructor only the class can instantiate it.
    private Singleton(){}

    /**
     * if null than we didnt create an instance yet
     * after that create it trough its Private constructor and assign it
     * if it was created it wont go trough the null check and just return its instance!
     * @return
     */
    public static Singleton getInstance(){
//        if (uniqueInstance == null){
//            uniqueInstance = new Singleton();
//        }
        return uniqueInstance;
    }

    //useful methods here

}
