package com.example.nbsm.headfirstdesignbook2;

import com.example.nbsm.headfirstdesignbook2.Model.Pizza.CheesePizza;
import com.example.nbsm.headfirstdesignbook2.Model.Pizza.GreekPizza;
import com.example.nbsm.headfirstdesignbook2.Model.Pizza.Pizza;

/**
 * Created by nbsm on 14-12-2016.
 */

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }
        else if(type.equals("greek")){
            pizza = new GreekPizza();
        }
        return pizza;
    }
}
