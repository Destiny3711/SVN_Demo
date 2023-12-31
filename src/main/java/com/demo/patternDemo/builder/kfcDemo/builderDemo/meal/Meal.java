package com.demo.patternDemo.builder.kfcDemo.builderDemo.meal;

import com.demo.patternDemo.builder.kfcDemo.builderDemo.food.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();
    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        double cost = 0;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.pack().pack());
            System.out.println(", Price : " + item.price());
        }

    }
}
