package com.example.nbsm.headfirstoop.chapter5PartTwo.chapter5.Domain.Instruments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by nbsm on 30-11-2016.
 */

public class InstrumentSpec {
    private Map<Object,Object> properties;


    public InstrumentSpec(Map properties) {
        if (properties == null){
            this.properties = new HashMap();
        }else{
            this.properties = new HashMap(properties);
        }
    }

    public Map getProperties() {
        return properties;
    }

    public Object getProperty(String propertyName){
        return properties.get(propertyName);
    }

    public boolean matches(InstrumentSpec otherSpec) {
        for (Iterator i = otherSpec.getProperties().keySet().iterator(); i.hasNext(); ) {
            String propertyName = (String) i.next();
            if (!properties.get(propertyName).equals(otherSpec.getProperty(propertyName))) {
                return false;
            }
        }
        return true;
    }

        //Voorruit denkende oplossing Gotta KISS (Keep It Simple Stupid)
//        for (HashMap.Entry<Object, Object> property : properties.entrySet()){
//            if (!property.equals(otherSpec.properties)){
//                return false;
//            }
//        }
//          return true;

        // OLD
//        if (model != otherSpec.getProperty()){
//            return false;
//        }
//        if (backWood != otherSpec.backWood){
//            return false;
//        }
//        if (topWood != otherSpec.topWood){
//            return false;
//        }
//        if(type != otherSpec.type){
//            return false;
//        }
//        if (builder != otherSpec.builder){
//            return false;
//        }
//        // everything matched
//        return true;
//    }

}
