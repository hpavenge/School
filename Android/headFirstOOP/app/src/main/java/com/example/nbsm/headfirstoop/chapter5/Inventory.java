package com.example.nbsm.headfirstoop.chapter5;

import com.example.nbsm.headfirstoop.chapter5.Guitar.Enums.Builder;
import com.example.nbsm.headfirstoop.chapter5.Guitar.Enums.Type;
import com.example.nbsm.headfirstoop.chapter5.Guitar.Enums.Wood;
import com.example.nbsm.headfirstoop.chapter5.Guitar.Guitar;
import com.example.nbsm.headfirstoop.chapter5.Guitar.GuitarSpec;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nbsm on 24-11-2016.
 */

public class Inventory {
    List<Guitar> guitars;

    public Inventory(){
        guitars = new ArrayList<Guitar>();
    }

    public void AddGuitar(String serialNumber, double price, GuitarSpec guitarSpec){
        Guitar guitar = new Guitar(serialNumber,price,guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Guitar guitar: guitars){
            if (guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec guitarSpec){
        // matching search list
        List<Guitar> matchingGuitars = new ArrayList<Guitar>();
        for (Guitar guitar : guitars){
            // search function delegated to guitarspec matches()
            if (guitar.getGuitarspec().matches(guitarSpec)){
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }
}
