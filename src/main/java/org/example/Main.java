package org.example;

import org.example.paymentServices.CheckoutService;
import org.example.products.MobileScratch;
import org.example.products.Product;
import org.example.products.Cheese;
import org.example.products.TV;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(20000);
        Cart cart = new Cart();
        Product cheese = new Cheese("Cheese", 80, 20, 250, 10, new Date("2025/7/20"));
        Product tv = new TV("TV", 12000, 10, 2000, 100);
        Product mobileScratch = new MobileScratch("MobileScratch", 5, 100);
        cart.add(cheese, 2);
        cart.add(tv, 1);
        cart.add(mobileScratch, 10);
        CheckoutService checkoutService = new CheckoutService(customer, cart);
        checkoutService.Checkout(customer, cart);

    }
}