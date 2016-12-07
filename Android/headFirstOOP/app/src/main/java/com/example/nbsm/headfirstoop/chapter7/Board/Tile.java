package com.example.nbsm.headfirstoop.chapter7.Board;

import com.example.nbsm.headfirstoop.chapter7.Units.Unit;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by nbsm on 7-12-2016.
 */

public class Tile {
    private List units;

    public Tile(){
        units = new LinkedList();
    }

    protected void addUnit(Unit unit){
        units.add(unit);
    }

    protected void removeUnit(Unit unit){
        units.remove(unit);
    }

    protected void removeUnits(){
        units.clear();
    }

    public List getUnits() {
        return units;
    }
}
