package org.example;

public class DiscountService {

    public int applyDiscount(int amount) {

        if (amount <= 0) {
            return amount;
        }

        if (amount <= 1000) {
            return amount;
        }

        return amount - 100;
    }
}