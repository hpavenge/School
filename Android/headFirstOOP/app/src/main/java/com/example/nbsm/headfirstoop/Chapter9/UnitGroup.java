package com.example.nbsm.headfirstoop.Chapter9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by nbsm on 8-12-2016.
 */

public class UnitGroup {
    private Map units; // because unit id as key and the object unit as value

    // create a Unitgroup by passing a list of units
    public UnitGroup(List unitlist){
        units = new HashMap();
        for (Iterator i = unitlist.iterator(); i.hasNext();){
            Unit unit = (Unit) i.next();
            units.put(unit.getId(),unit);
        }
    }

    public UnitGroup(){
        this(new LinkedList());
    }

    public void addUnit(Unit unit){
        units.put(unit.getId(),unit);
    }

    public void removeUnit(int id){
        units.remove(id);
    }

    public void removeUnit(Unit unit){
        removeUnit(unit.getId());
    }

    public Unit getUnit(int id){
        return (Unit)units.get(id);
    }
    // extra work with getting units since we choose to store them in a map
    public List getUnits() {
        List unitList = new LinkedList();
        for (Iterator i = unitList.iterator(); i.hasNext();){
            Unit unit = (Unit) i.next();
            unitList.add(unit);
        }
        return unitList;
    }
}
