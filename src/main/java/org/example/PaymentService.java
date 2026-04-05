package org.example;

public class PaymentService {
    public boolean pay(int amount) {
        System.out.println("Payment processed for: $" + amount);
        return true; // Always succeed for demo
    }
}