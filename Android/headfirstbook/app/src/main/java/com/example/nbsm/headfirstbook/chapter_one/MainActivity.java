package com.example.nbsm.headfirstbook.chapter_one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nbsm.headfirstbook.R;
import com.example.nbsm.headfirstbook.chapter_one.ducks.Duck;
import com.example.nbsm.headfirstbook.chapter_one.ducks.MallardDuck;
import com.example.nbsm.headfirstbook.chapter_one.ducks.ModelDuck;
import com.example.nbsm.headfirstbook.chapter_one.ducks.RedheadDuck;
import com.example.nbsm.headfirstbook.chapter_one.ducks.RubberDuck;
import com.example.nbsm.headfirstbook.chapter_one.fly.FlyRocketPowered;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck rubber = new RubberDuck();
        rubber.performQuack();
        rubber.performFly();

        Duck redhead = new RedheadDuck();
        redhead.performFly();

        Duck modelduck = new ModelDuck();
        modelduck.performQuack();
        modelduck.setFlyBehavior(new FlyRocketPowered());
        modelduck.performFly();
    }
}
