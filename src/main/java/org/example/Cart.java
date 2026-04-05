package org.example;

public class Cart {
    private long total;

    public Cart() {
        total = 0;
    }

    public void addProduct(String category, long price) {
        if (price <= 0) return; // ignoring zero or negative prices
        total += price;
    }

    public long getTotal() {
        return total;
    }

    public void reset() {
        total = 0;
    }
}