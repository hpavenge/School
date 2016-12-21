package com.example.nbsm.headfirstdesignbook2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nbsm.headfirstdesignbook2.Model.Pizza.CheesePizza;
import com.example.nbsm.headfirstdesignbook2.Model.Pizza.GreekPizza;
import com.example.nbsm.headfirstdesignbook2.Model.Pizza.Pizza;

public class PizzaMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_main);
        PizzaStore nyPizzaStory = new NyPizzaStore();

        nyPizzaStory.orderPizza("cheese");
    }

}
