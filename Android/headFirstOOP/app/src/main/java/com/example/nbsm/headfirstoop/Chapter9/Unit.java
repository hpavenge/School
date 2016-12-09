package com.example.nbsm.headfirstoop.Chapter9;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by nbsm on 8-12-2016.
 */

public class Unit {
    private int id;
    private String type;
    private String name;
    private List weapons;
    private Map properties;

    // solo id Flexibility based
    public Unit(int id){
        this.id = id;
    }

    // only getter because constructor has the setter
    public int getId(){
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addWeapon(Weapon weapon){
        if (weapons== null){
            weapons = new LinkedList(); // null error
        }
        weapons.add(weapon);
    }

    public List getWeapons() {
        return weapons;
    }

    public void setProperty(String property, Object value){
        if (properties == null){
            properties = new HashMap();
        }
        properties.put(property,value);
    }
    // Defensive programming im sure ur great but i could send u null and u wouldnt handle it and blow up
    public Object getProperty(String property) throws RuntimeException {
            if (properties == null){
                throw  new RuntimeException("What the heck are you doing mate, No properties");
            }
            Object value = properties.get(property);
            if (value ==null){
                throw new RuntimeException("Youre failing mate! No property value");
            }else {
                return value;
            }
    }

    // Contract Programming i trust u to handle this null error
//    public Object getProperty(String property){
//        if (properties == null){
//            return null;
//        }
//        return properties.get(property);
//    }

    public Map getProperties() {
        return properties;
    }
}
