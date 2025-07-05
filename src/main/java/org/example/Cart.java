package org.example;

import org.example.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Item> items;

    public Cart (){
        items = new ArrayList<>();
    }

    public void add (Product item, int quantity){
        int q = item.getQuantity();
        if(item.getQuantity() <= q){
            items.add(new Item(item, quantity));
        }
        else{
            throw new RuntimeException ("Item quantity is not enough");
        }
    }

    public List<Item> getItems(){
        return this.items;
    }
}
