package com.example.nbsm.headfirstoop.ChapterOne.Domain.Model;

import com.example.nbsm.headfirstoop.ChapterOne.Domain.Enum.Type;
import com.example.nbsm.headfirstoop.ChapterOne.Domain.Enum.Weight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nbsm on 18-11-2016.
 */

public class Inventory {
    List<Item> items;

    public Inventory(){
        //test gegevens
        items = new ArrayList<Item>();
    }

    public void addItem(int id, String name, Type type, double price, int score, Weight weight){
        ItemSpec itemSpec = new ItemSpec(name,type,weight);
        Item item = new Item(id,itemSpec,price,score);
        items.add(item);
    }

    /**
     *
     * @param itemId the id of the item you want to find
     * @return the found item or null on fail
     */
    public Item getItem(int itemId){
        for(Item item : items){
            if (item.getId() == itemId){
                return item;
            }
        }
        return null;
    }

    /**
     *
     * @param searchSpec the search specifications
     * @return the item if its in the list otherwise null on fail
     */
    public List<Item> search(ItemSpec searchSpec){
        List<Item> matchingItems = new ArrayList<Item>();
        for (Item item : items){
            // sick recheck .matches + lowercase zit er nu niet meer in
            if (item.getItemSpec().matches(searchSpec)) {
                matchingItems.add(item);
            }
        }
        return matchingItems;
    }
}
