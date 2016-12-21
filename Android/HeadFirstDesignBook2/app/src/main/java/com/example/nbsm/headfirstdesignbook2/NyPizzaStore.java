package com.example.nbsm.headfirstdesignbook2;

import com.example.nbsm.headfirstdesignbook2.Factory.SimplePizzaFactory;
import com.example.nbsm.headfirstdesignbook2.Model.Pizza.NYCheesePizza;
import com.example.nbsm.headfirstdesignbook2.Model.Pizza.NYGreekPizza;
import com.example.nbsm.headfirstdesignbook2.Model.Pizza.Pizza;

/**
 * Created by nbsm on 14-12-2016.
 */

public class NyPizzaStore extends PizzaStore {
    /**
     * A factory method handles object creation and encapsulates it in
     a subclass. This decouples the client code in the superclass from
     the object creation code in the subclass.
     * @param simplePizzaFactory
     */
    public NyPizzaStore(SimplePizzaFactory simplePizzaFactory) {
        super(simplePizzaFactory);
    }

    /**
     * now if this franchise wants NY style for pizzas for its customers it uses the NY subclass which has its own createpizza method
     * check code to explain
     * @param type
     * @return
     */
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
        pizza = new NYCheesePizza();
        }
        else if(type.equals("greek")){
        pizza = new NYGreekPizza();
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
