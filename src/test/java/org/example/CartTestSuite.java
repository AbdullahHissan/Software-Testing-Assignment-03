package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartTestSuite {
    private Cart cart; // Use Cart instead of SlowCartTest

    @BeforeEach
    void setup() {
        cart = new Cart(); // Instantiate the actual Cart class
    }

    @Test
    void should_addPrices_correctly() {
        cart.addProduct("Electronics", 100L);
        cart.addProduct("Food", 200L);
        assertEquals(300L, cart.getTotal(), "Total should be 300 after adding 100 and 200");
    }

    @Test
    void should_handleZeroPrice() {
        cart.addProduct("Misc", 0L);
        assertEquals(0L, cart.getTotal(), "Total should remain 0 after adding 0");
    }

    @Test
    void should_updateTotal_sequentially() {
        cart.reset();
        cart.addProduct("Item1", 50L);
        assertEquals(50L, cart.getTotal(), "Total should be 50 after first add");

        cart.addProduct("Item2", 25L);
        assertEquals(75L, cart.getTotal(), "Total should be 75 after second add (50+25)");
    }

    @Test
    void should_resetTotal() {
        cart.reset();
        cart.addProduct("Item1", 100L);
        cart.reset();
        assertEquals(0L, cart.getTotal(), "Total after reset should be 0");
    }

    @Test
    void should_ignoreNegativePrice() {
        cart.addProduct("Item1", -100L);
        assertEquals(0L, cart.getTotal(), "Negative price should not affect total");
    }

    @Test
    void should_handleLargeValues() {
        cart.addProduct("Item1", 10000L);
        cart.addProduct("Item2", 20000L);
        assertEquals(30000L, cart.getTotal(), "Total should be 30000 after adding 10000 and 20000");
    }
}