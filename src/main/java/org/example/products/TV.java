package org.example.products;

import org.example.expiration.NotExpiring;
import org.example.shipping.ShippedItem;

import java.util.Date;

public class TV extends Product {
    double weight;
    int shippingFees;
    public TV(String name, double price, int quantity, double weight, int shippingFees){
        super(name, price, quantity, new ShippedItem(weight, shippingFees), new NotExpiring());
    }
}
