package org.example;

class PaymentService {

    public boolean pay(int amount) {
        // Return false for zero or negative amounts
        if (amount <= 0) {
            return false;
        }
        // Dummy logic for positive payment
        return true;
    }
}