package org.example.shipping;

public class NoShipping implements Shipping {
    public double getWeight(){
        return 0;
    }
    public int getShippingFees(){
        return 0;
    }
}
