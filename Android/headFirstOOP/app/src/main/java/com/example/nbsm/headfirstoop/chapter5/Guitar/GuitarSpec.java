package com.example.nbsm.headfirstoop.chapter5.Guitar;

import com.example.nbsm.headfirstoop.chapter5.Guitar.Enums.Builder;
import com.example.nbsm.headfirstoop.chapter5.Guitar.Enums.Type;
import com.example.nbsm.headfirstoop.chapter5.Guitar.Enums.Wood;

/**
 * Created by nbsm on 24-11-2016.
 */

public class GuitarSpec {
    private String model;
    private int numStrings;
    private Wood backWood;
    private Wood topWood;
    private Type type;
    private Builder builder;

    public GuitarSpec(String model, int numStrings, Wood backWood, Wood topWood, Type type, Builder builder) {
        this.model = model;
        this.numStrings = numStrings;
        this.backWood = backWood;
        this.topWood = topWood;
        this.type = type;
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood(){
        return topWood;
    }

    public Type getType() {
        return type;
    }

    public Builder getBuilder() {
        return builder;
    }

    public boolean matches(GuitarSpec otherSpec){
        if (model != otherSpec.model){
            return false;
        }
        if (numStrings != otherSpec.numStrings){
            return false;
        }
        if (backWood != otherSpec.backWood){
            return false;
        }
        if (topWood != otherSpec.topWood){
            return false;
        }
        if(type != otherSpec.type){
            return false;
        }
        if (builder != otherSpec.builder){
            return false;
        }
        // everything matched
        return true;
    }
}
