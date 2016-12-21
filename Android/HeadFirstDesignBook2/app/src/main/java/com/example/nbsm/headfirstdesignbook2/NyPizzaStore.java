package com.example.nbsm.headfirstdesignbook2;

import com.example.nbsm.headfirstdesignbook2.Factory.NYPizzaIngredientFactory;
import com.example.nbsm.headfirstdesignbook2.Factory.PizzaIngredientFactory;
import com.example.nbsm.headfirstdesignbook2.Factory.SimplePizzaFactory;
import com.example.nbsm.headfirstdesignbook2.Model.Pizza.CheesePizza;
import com.example.nbsm.headfirstdesignbook2.Model.Pizza.ClamPizza;
import com.example.nbsm.headfirstdesignbook2.Model.Pizza.Pizza;

/**
 * Created by nbsm on 14-12-2016.
 */

public class NyPizzaStore extends PizzaStore {

    public NyPizzaStore() {

    }

    /**
     * now if this franchise wants NY style for pizzas for its customers it uses the NY subclass which has its own createpizza method
     * check code to explain
     * @param item
     * @return
     */
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New york style Cheese pizza");
        }
        else if(item.equals("greek")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New york style Clam pizza");
        }
        return pizza;
    }
}
