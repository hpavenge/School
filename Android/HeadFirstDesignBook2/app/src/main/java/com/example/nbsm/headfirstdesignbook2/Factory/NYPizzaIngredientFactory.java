package com.example.nbsm.headfirstdesignbook2.Factory;

import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Cheese.Cheese;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Cheese.ReggianoCheese;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Clams.Clams;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Clams.FreshClams;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Dough.Dough;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Pepperoni.Pepperoni;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Pepperoni.SlicedPepperoni;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Sauce.MarinaraSauce;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Sauce.Sauce;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Dough.ThinCrustDough;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Veggies.Garlic;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Veggies.Mushroom;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Veggies.Onion;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Veggies.RedPepper;
import com.example.nbsm.headfirstdesignbook2.Model.Ingredient.Veggies.Veggies;


/**
 * Created by nbsm on 21-12-2016.
 */

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    /**
     * all ny stuff their own taste of stuff
     * @return
     */
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
