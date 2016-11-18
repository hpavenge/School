package com.example.nbsm.headfirstoop.Domain.Model;

import com.example.nbsm.headfirstoop.Domain.Enum.Type;
import com.example.nbsm.headfirstoop.Domain.Enum.Weight;

/**
 * Created by nbsm on 18-11-2016.
 */

public class ItemSpec {
    String name;
    Type type;
    Weight weight;


    public ItemSpec(String name, Type type, Weight weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public boolean matches(ItemSpec searchSpec){
        if (!name.equals(searchSpec.getName())) {
            return false;
        }
        if (type != searchSpec.getType()) {
            return false;
        }
        return true;
    }
}
