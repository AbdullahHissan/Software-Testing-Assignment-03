package org.example;

public class OrderService {

    public boolean placeOrder(int amount) {
        return amount > 0;   // only positive values allowed
    }
}