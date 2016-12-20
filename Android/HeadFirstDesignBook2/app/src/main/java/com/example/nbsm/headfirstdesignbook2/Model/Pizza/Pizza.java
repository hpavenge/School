package com.example.nbsm.headfirstdesignbook2.Model.Pizza;

/**
 * Created by nbsm on 14-12-2016.
 */

public abstract class Pizza {

    /**
     * implement pizza's yo
     */
    public Pizza(){
    }

    abstract public void prepare();

    abstract public void bake();

    abstract public void cut();

    abstract public void box();

}
