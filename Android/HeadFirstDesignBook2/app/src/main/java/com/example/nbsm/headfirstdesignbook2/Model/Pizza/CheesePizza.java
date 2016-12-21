package com.example.nbsm.headfirstdesignbook2.Model.Pizza;

import com.example.nbsm.headfirstdesignbook2.Factory.PizzaIngredientFactory;

/**
 * Created by nbsm on 14-12-2016.
 */

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        //magic happening right here
        System.out.println("preparing" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        // pizza just needs cheese and wants a factory to make it all are fine as long as they are ingredientfactorys, the createsauce is diff for every region
    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
