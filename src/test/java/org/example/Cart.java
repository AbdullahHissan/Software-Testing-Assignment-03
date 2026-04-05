package org.example;

public class Cart {
    private long total;

    public Cart() {
        total = 0;
    }

    public void addProduct(String category, long price) {
        if (price <= 0) return; // ignore zero or negative prices

        // Only allow these categories
        switch (category) {
            case "Electronics":
            case "Food":
            case "Clothes":
                total += price;
                break;
            default:
                throw new IllegalArgumentException("Invalid category: " + category);
        }
    }

    public long getTotal() {
        return total;
    }

    public void reset() {
        total = 0;
    }
}