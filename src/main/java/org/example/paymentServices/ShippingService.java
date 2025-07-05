package org.example.paymentServices;

import org.example.Cart;
import org.example.Item;
import org.example.products.Product;
import org.example.shipping.NoShipping;

import java.util.List;

public class ShippingService {
    private final Cart cart;

    public ShippingService(Cart cart){
        this.cart = cart;
    }

    public String getProductName(Product product){ return product.getName(); }
    public double getWeight(Product product){ return product.shippingWeight(); }

    public int shipping(){
        double weight = 0;
        int shippingFees = 0;
        List<Item> items = cart.getItems();
        System.out.println("** Shipment notice **");
        for (Item it : items) {
            if(it.getProduct().shipping instanceof NoShipping)
                continue;
            Product p = it.getProduct();
            shippingFees += p.shippingFees() * it.getQuantity();
            weight += (getWeight(p) * it.getQuantity());
            System.out.println(it.getQuantity() + "X " + getProductName(p) + "    " + getWeight(p) * it.getQuantity() + "g");
        }
        weight /= 1000;
        System.out.println("Total package weight " + weight + "Kg\n");
        return shippingFees;
    }
}
