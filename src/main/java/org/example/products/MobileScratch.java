package org.example.products;

import org.example.expiration.Expiration;
import org.example.expiration.NotExpiring;
import org.example.products.Product;
import org.example.shipping.NoShipping;
import org.example.shipping.Shipping;

import java.util.Date;

public class MobileScratch extends Product {
    public MobileScratch(String name, double price, int quantity){
        super(name, price, quantity, new NoShipping(), new NotExpiring());
    }
}
