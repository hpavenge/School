package com.example.nbsm.headfirstoop.chapter7.Board;

import com.example.nbsm.headfirstoop.chapter7.Units.Unit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nbsm on 7-12-2016.
 */

public class BoardImpl implements Board {

    private int width, height;
    private List tiles;

    public BoardImpl(int width, int height){
        this.width = width;
        this.height = height;
        initialize();
    }

    public void initialize(){
        tiles = new ArrayList(width);
        for (int i = 0; i < width; i++){
            tiles.add(i,new ArrayList<>(height));
            for (int j = 0; j < height; j++){
                ((ArrayList)tiles.get(i)).add(j,new Tile());
            }
        }
    }
    @Override
    public Tile getTile(int x, int y) {
        return (Tile) ((ArrayList)tiles.get(x-1)).get(y-1);
    }

    @Override
    public void addUnit(Unit unit, int x, int y) {
        Tile tile = getTile(x,y);
        tile.addUnit(unit);
    }

    @Override
    public void removeUnit(Unit unit, int x, int y) {
        Tile tile = getTile(x,y);
        tile.removeUnit(unit);
    }

    @Override
    public void removeUnits(int x, int y) {
        Tile tile = getTile(x,y);
        tile.removeUnits();
    }

    @Override
    public List<Unit> getUnits(int x, int y) {
        Tile tile = getTile(x,y);
        return tile.getUnits();
    }
}
