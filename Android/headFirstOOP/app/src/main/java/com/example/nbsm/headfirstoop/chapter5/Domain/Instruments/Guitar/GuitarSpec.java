package com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Guitar;

import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.InstrumentSpec;
import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Enums.Builder;
import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Enums.Type;
import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Enums.Wood;

/**
 * Created by nbsm on 24-11-2016.
 */

public class GuitarSpec extends InstrumentSpec {
    private int numStrings;

    public GuitarSpec(String model, int numStrings, Wood backWood, Wood topWood, Type type, Builder builder) {
        super(model,backWood,topWood,type,builder);
        this.numStrings = numStrings;
    }



    public int getNumStrings() {
        return numStrings;
    }

    public boolean matches(InstrumentSpec otherSpec){
        if (!super.matches(otherSpec)){
            return false;
        }
        if (!(otherSpec instanceof GuitarSpec)){
            return false;
        }
        GuitarSpec spec = (GuitarSpec) otherSpec;
        if (numStrings != spec.numStrings){
            return false;
        }
        // everything matched
        return true;
    }
}
