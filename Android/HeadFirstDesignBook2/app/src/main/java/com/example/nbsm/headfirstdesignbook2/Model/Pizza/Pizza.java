package com.example.nbsm.headfirstdesignbook2.Model.Pizza;

import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Cheese.Cheese;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Clams.Clams;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Dough.Dough;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Pepperoni.Pepperoni;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Sauce.Sauce;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Veggies.Veggies;

/**
 * Created by nbsm on 14-12-2016.
 */

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    /**
     * implement pizza's yo
     */
    public Pizza(){
    }

    // abstract because  this will be done be the factory which are different
    abstract void prepare();

    public void bake(){
        System.out.println("Bake for 20 minutes on 220");
    }

    public void cut(){
        System.out.println("Cut this majestic pizza in slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        // code to print pizza
        String string = "This is pizza" + name;
        return string;
    }
}
