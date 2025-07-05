package org.example.shipping;

public class ShippedItem implements Shipping {
    private final double weight;
    private final int fees;
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
