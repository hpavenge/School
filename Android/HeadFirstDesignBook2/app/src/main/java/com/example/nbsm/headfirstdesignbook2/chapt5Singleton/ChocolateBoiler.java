package com.example.nbsm.headfirstdesignbook2.chapt5Singleton;

/**
 * Created by nbsm on 21-12-2016.
 */

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler chocolateBoilerInstance = new ChocolateBoiler();

    //only started when boiler empty
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    // Singleton it only one instance can exist
    public static ChocolateBoiler getInstance(){
        return chocolateBoilerInstance;
    }
    // needs to fill but only if empty
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    // checks must be full and boiled
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    // must be full and not been boiled yet !jeez!
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
