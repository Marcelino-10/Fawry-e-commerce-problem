package org.example.paymentServices;

import org.example.Cart;
import org.example.Customer;
import org.example.Item;
import org.example.products.Product;

import java.util.List;

public class CheckoutService {
    Customer customer;
    Cart cart;

    public CheckoutService(Customer customer, Cart cart){
        this.customer = customer;
        this.cart = cart;
    }

    public void Checkout(Customer customer, Cart cart){
        List<Item> items = cart.getItems();

        if(items.isEmpty())
            throw new RuntimeException("The cart is Empty");

        double price = 0;
        for(Item it : items){
            if(it.getProduct().isExpired())
                throw new RuntimeException("Product is Expired");
            if(it.getQuantity() == 0)
                throw new RuntimeException("Item is out of Stock");
            price += (it.getProduct().getPrice() * it.getQuantity());
        }

        if(price > customer.getBalance()){
            throw new RuntimeException("Insufficient Balance can't proceed");
        }

        ShippingService shippingService = new ShippingService(cart);
        int shippingFees = shippingService.shipping();

        if(price + shippingFees > customer.getBalance())
            throw new RuntimeException("Insufficient Balance can't proceed");

        customer.setBalance(customer.getBalance() - (price + shippingFees));

        System.out.println("** Checkout receipt **");
        for (Item it : items) {
            Product p = it.getProduct();
            System.out.println(it.getQuantity() + "X " + p.getName() + "    " + p.getPrice() * it.getQuantity());
        }
        System.out.println("--------------------");
        System.out.println("Subtotal " + price);
        System.out.println("Shipping " + shippingFees);
        System.out.println("Amount " + (int) (price + shippingFees));
        System.out.println("Balance is " + customer.getBalance());
    }
}
