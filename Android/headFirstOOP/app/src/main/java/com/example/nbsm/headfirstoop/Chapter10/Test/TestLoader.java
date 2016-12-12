package com.example.nbsm.headfirstoop.Chapter10.Test;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nbsm.headfirstoop.Chapter10.Loader.SubwayLoader;
import com.example.nbsm.headfirstoop.Chapter10.Subway.Subway;
import com.example.nbsm.headfirstoop.R;

import java.io.File;
import java.io.IOException;

public class TestLoader extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_loader);
        try{
            AssetManager am = getApplicationContext().getAssets();
            SubwayLoader subwayLoader =new SubwayLoader();
            Subway objectVille = subwayLoader.loadFromStream(am.open("derp.txt"));
            System.out.println("Testing objectVille");
            System.out.println("First le Stationes");
            if (objectVille.hasStation("DRY Drive")){
                System.out.println("Nice uve done well my obi wan kanobi. statione succes");
            }
            else{
                System.out.println("station test failed");
            }
            System.out.println("Testing connectionones");
            if (objectVille.hasConnection("Booch Line", "UML Walk","Objectville PizzaStore")){
                System.out.println("Test success");
            }
            else{
                System.out.println("Connectiones FAILED");
            }
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
}
