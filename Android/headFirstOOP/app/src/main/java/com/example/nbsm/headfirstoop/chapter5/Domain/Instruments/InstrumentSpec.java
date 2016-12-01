package com.example.nbsm.headfirstoop.chapter5.Domain.Instruments;

import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Enums.Builder;
import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Enums.Type;
import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Enums.Wood;

/**
 * Created by nbsm on 30-11-2016.
 */

public abstract class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public InstrumentSpec(String model, Wood backWood, Wood topWood, Type type, Builder builder) {
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
        this.type = type;
        this.builder = builder;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood(){
        return topWood;
    }

    public boolean matches(InstrumentSpec otherSpec){
        if (model != otherSpec.model){
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
