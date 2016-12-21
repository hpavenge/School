package com.example.nbsm.headfirstdesignbook2;

import com.example.nbsm.headfirstdesignbook2.Factory.SimplePizzaFactory;
import com.example.nbsm.headfirstdesignbook2.Model.Pizza.Pizza;

/**
 * Created by nbsm on 14-12-2016.
 */

public abstract class PizzaStore {
    /**
     * This ish the pizza Store
     * Thank you come again
     * Made it abstract after factory
     * @param savedInstanceState
     */

    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(){

    }

    // first one
//    public Pizza orderPizza(){
//        Pizza pizza = new Pizza("testpizza");
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();
//        return pizza;
//    }

    /**
     * need more then one piazza
     * first problam = pizza interface and implement it
     * @param type
     * @return
     */
//    public Pizza orderPizza(String type){
//        Pizza pizza = null;
//        if(type.equals("cheese")){
//            pizza = new CheesePizza();
//        }
//        else if(type.equals("greek")){
//            pizza = new GreekPizza();
//        }
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();
//        return pizza;
//    }

    /**
     * Flooded with new pizzas -> encapsulate what varies
     * object creation varies so... FACTORY
     */
    public Pizza orderPizza(String type){
        Pizza pizza = null;
        // hai solution: note -> delegated that shit
        // ps look back remamber we used new over here it's gone now
        //pizza = simplePizzaFactory.createPizza(type);

        //EVOLUTION
        pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    //factory method is now abstract in pizzastore
    abstract Pizza createPizza(String type);
}
