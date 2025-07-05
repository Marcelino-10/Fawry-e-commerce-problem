package org.example;

import org.example.expiration.ExpiringItem;
import org.example.products.MobileScratch;
import org.example.products.Product;
import org.example.products.Cheese;
import org.example.products.TV;
import org.example.shipping.ShippedItem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(2000);
        Cart cart = new Cart();
        Product cheese = new Cheese("Cheese", 123, 3, 300, 100, new Date("2025/7/2"));
        Product tv = new TV("TV", 123, 3, 300, 100);
        Product mobileScratch = new MobileScratch("MobileScratch", 123, 3);
        Item cheeseItem = new Item(cheese, 4);
        Item tvItem = new Item(tv, 7);
        Item mobileScratchItem = new Item(mobileScratch, 7);
        cart.add(cheese, 2);
        cart.add(tv, 1);
        cart.add(mobileScratch, 2);
        Checkout checkout = new Checkout(customer, cart);
        checkout.CheckoutService(customer, cart);

    }
}