package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartCSVTest {

    @Test
    void should_loadProductsFromCSVAndCalculateTotal() {
        // Use the actual Cart class instead of SlowCartTest
        Cart cart = new Cart();

        // Load products from the CSV file into the cart
        CartCSV.addProductsFromCSV("/cartTests.csv", cart);

        // Assuming the CSV contains these values:
        // 100 + 50 + 75 + 1200 + 20 + 1 + 100 + 50 + 1_000_000 + 500_000 + 100 + 200 + 300 = 1_502_196
        assertEquals(1_502_196, cart.getTotal(), "Total should match sum of all CSV products");
    }
}