package com.example.nbsm.headfirstdesignbook2.chapt8EncapAlgorithmsTemplatePattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nbsm.headfirstdesignbook2.R;

public class TemplatePatternMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_pattern_main);
        Tea myTea = new Tea();
        myTea.prepareRecipe();
        // which boils, brewsimp, pourincup, addCondimentsImp
    }
}
