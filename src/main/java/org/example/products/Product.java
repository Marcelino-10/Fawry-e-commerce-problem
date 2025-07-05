package org.example.products;

import org.example.expiration.Expiration;
import org.example.shipping.Shipping;

import java.util.Date;

public abstract class Product {
    private final String name;
    private final double price;
    private final int quantity;

    public Shipping shipping;
    public Expiration expiry;

    public Product(String name, double price, int quantity, Shipping shipping, Expiration expiry){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.shipping = shipping;
        this.expiry = expiry;
    }

    public String getName(){
        return this.name;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double getPrice(){
        return this.price;
    }

    public int shippingFees(){
        return shipping.getShippingFees();
    }
    public double shippingWeight(){
        return shipping.getWeight();
    }
    public boolean isExpired(){
        return expiry.isExpired();
    }
}
