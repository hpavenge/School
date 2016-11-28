package com.example.nbsm.headfirstoop.ChapterOne.Domain.Model;

/**
 * Created by nbsm on 18-11-2016.
 */

public class Item {
    int id;
    ItemSpec itemSpec;
    double price;
    int score;

    public Item(int id, ItemSpec itemspec, double price, int score) {
        this.id = id;
        this.itemSpec = itemspec;
        this.price = price;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ItemSpec getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(ItemSpec itemSpec) {
        this.itemSpec = itemSpec;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
