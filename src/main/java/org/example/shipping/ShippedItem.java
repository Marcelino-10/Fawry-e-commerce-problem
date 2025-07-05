package org.example.shipping;

import org.example.shipping.Shipping;

public class ShippedItem implements Shipping {
    private double weight;
    private int fees;
    public ShippedItem(double weight, int fees){
        this.weight = weight;
        this.fees = fees;
    }

    public double getWeight(){
        return this.weight;
    }

    public int getShippingFees(){
        return this.fees;
    }
}
