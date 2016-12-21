package com.example.nbsm.headfirstdesignbook2.Factory;

import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Cheese.Cheese;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Clams.Clams;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Dough.Dough;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Pepperoni.Pepperoni;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Sauce.Sauce;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Veggies.Veggies;

/**
 * Created by nbsm on 21-12-2016.
 */

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
    // made them classes but later on can make them abstract or even make a base abstract class ingredient
}
