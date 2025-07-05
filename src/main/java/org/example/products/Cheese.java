package org.example.products;

import org.example.expiration.ExpiringItem;
import org.example.shipping.ShippedItem;

import java.util.Date;

public class Cheese extends Product {
    double weight;
    int shippingFees;
    Date expiryDate;
    public Cheese(String name, double price, int quantity, double weight, int shippingFees, Date expiryDate){
        super(name, price, quantity, new ShippedItem(weight, shippingFees), new ExpiringItem(expiryDate));
    }
}
