package com.example.nbsm.headfirstoop.chapter5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nbsm.headfirstoop.R;
import com.example.nbsm.headfirstoop.chapter5.Guitar.Enums.Builder;
import com.example.nbsm.headfirstoop.chapter5.Guitar.Enums.Type;
import com.example.nbsm.headfirstoop.chapter5.Guitar.Enums.Wood;
import com.example.nbsm.headfirstoop.chapter5.Guitar.Guitar;
import com.example.nbsm.headfirstoop.chapter5.Guitar.GuitarSpec;

import java.util.List;

public class ShopSimulator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_simulator);
        Inventory inventory = new Inventory();
        //Create guitar and add it for testing purposes
        GuitarSpec guitarspec1 = new GuitarSpec("derp", 3 ,Wood.ADIRONDACK, Wood.ADIRONDACK, Type.ELECTRIC, Builder.ANY);
        //Guitar guitar1 = new Guitar("100", 10, guitarspec1); komt nog wel
        inventory.AddGuitar("100", 10, guitarspec1);
        inventory.AddGuitar("101", 20, guitarspec1);
        List<Guitar> foundGuitars = inventory.search(guitarspec1);
        for (Guitar guitar: foundGuitars){
            System.out.println("Found:"+guitar.getGuitarspec().getModel());
        }
    }
}
