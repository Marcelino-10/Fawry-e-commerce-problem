package org.example;

public class Customer {
    private  double balance;

    public Customer(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
}
