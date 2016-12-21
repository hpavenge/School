package com.example.nbsm.headfirstdesignbook2.Model.Pizza;

import com.example.nbsm.headfirstdesignbook2.Factory.PizzaIngredientFactory;

/**
 * Created by nbsm on 21-12-2016.
 */

public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    void prepare() {
        System.out.println("Preparing:" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
