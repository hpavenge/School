package com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Mandolin;


import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.InstrumentSpec;
import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Enums.Builder;
import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Enums.Type;
import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Enums.Wood;

/**
 * Created by nbsm on 30-11-2016.
 */

public class MandolinSpec extends InstrumentSpec {
    private Style style;

    public MandolinSpec(String model, Wood backWood, Wood topWood, Type type, Builder builder, Style style) {
        super(model, backWood, topWood, type, builder);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    public boolean matches(InstrumentSpec otherSpec){
        if (!super.matches(otherSpec)){
            return false;
        }
        if (!(otherSpec instanceof MandolinSpec)){
            return false;
        }
        MandolinSpec spec = (MandolinSpec) otherSpec;
        if (!style.equals(spec.style)){
            return false;
        }
        return true;
    }
}
