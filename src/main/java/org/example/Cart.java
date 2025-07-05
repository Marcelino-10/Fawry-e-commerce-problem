package org.example;

import org.example.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Item> items;

    public Cart (){
        items = new ArrayList<>();
    }

    public void add (Product product, int quantity){
        int availableQuantity = product.getQuantity();
        if(quantity <= availableQuantity){
            items.add(new Item(product, quantity));
        }
        else{
            throw new RuntimeException ("Item quantity is not enough");
        }
    }

    public List<Item> getItems(){
        return this.items;
    }
}
