package org.example;

import org.example.products.Product;
import org.example.shipping.NoShipping;

public class ShippingService {
    private Cart cart;

    public ShippingService(Cart cart){
        this.cart = cart;
    }

    public int shipping(){
        double weight = 0;
        int shippingFees = 0;
        System.out.println("** Shipment notice **");
        for (Item it : cart.getItems()) {
            if(it.getProduct().shipping instanceof NoShipping)
                continue;
            Product p = it.getProduct();
            shippingFees += it.getProduct().shippingFees() * it.getQuantity();
            weight += (p.shippingWeight() * it.getQuantity());
            System.out.println(it.getQuantity() + "X " + p.getName() + "    " + p.shippingWeight() * it.getQuantity() + "g");
        }
        weight /= 1000;
        System.out.println("Total package weight " + weight + "Kg\n");
        return shippingFees;
    }
}
