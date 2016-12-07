package com.example.nbsm.headfirstoop.chapter7.Board;

import com.example.nbsm.headfirstoop.chapter7.Units.Unit;

import java.util.List;

/**
 * Created by nbsm on 7-12-2016.
 * mistakes first attempt tileX and tileY = x, y
 * addUnit needs Unit in its constructor
 * removeUnit from scenario bonus
 * removeUnits same story
 */

public interface Board {
    Tile getTile(int x, int y);
    void addUnit(Unit unit,int x, int y);
    void removeUnit(Unit unit, int x, int y);
    void removeUnits(int x, int y);
    List<Unit> getUnits(int x, int y);
}
