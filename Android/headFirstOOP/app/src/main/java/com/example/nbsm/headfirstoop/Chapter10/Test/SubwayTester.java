package com.example.nbsm.headfirstoop.Chapter10.Test;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nbsm.headfirstoop.Chapter10.Loader.SubwayLoader;
import com.example.nbsm.headfirstoop.Chapter10.Printer.SubwayPrinter;
import com.example.nbsm.headfirstoop.Chapter10.Subway.Subway;
import com.example.nbsm.headfirstoop.R;

import java.util.List;

public class SubwayTester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subway_tester);
        try{
            AssetManager am = getApplicationContext().getAssets();
            SubwayLoader subwayLoader = new SubwayLoader();
            Subway objectVille = subwayLoader.loadFromStream(am.open("derp.txt"));

            List route = objectVille.getDirections("Ajax Rapids","JavaRanch");
            SubwayPrinter subwayPrinter = new SubwayPrinter(System.out);
            subwayPrinter.printDirections(route);
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
}
