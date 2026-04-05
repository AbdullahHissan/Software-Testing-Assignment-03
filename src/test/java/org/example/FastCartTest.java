package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FastCartTest {
    private Cart cart;

    @BeforeEach
    void setup() {
        cart = new Cart();
    }

    @Test
    void should_addMultiplePrices_fast() {
        cart.addProduct("Electronics", 100L);
        cart.addProduct("Food", 50L);
        cart.addProduct("Clothes", 25L);
        assertEquals(175L, cart.getTotal(), "Total should be 175 after adding 100, 50, 25");
    }

    @Test
    void should_handleLargeValues_fast() {
        cart.addProduct("Electronics", 1000L);
        cart.addProduct("Food", 2000L);
        assertEquals(3000L, cart.getTotal(), "Total should be 3000 after adding 1000, 2000");
    }

    @Test
    void should_handleZeroPrice_fast() {
        cart.addProduct("Electronics", 0L);
        assertEquals(0L, cart.getTotal(), "Total should remain 0 after adding 0");
    }

    @Test
    void should_updateSequentially_fast() {
        cart.reset();
        cart.addProduct("Electronics", 100L);
        assertEquals(100L, cart.getTotal(), "Total should be 100 after first add");

        cart.addProduct("Food", 50L);
        assertEquals(150L, cart.getTotal(), "Total should be 150 after second add");
    }

    @Test
    void should_resetTotal_fast() {
        cart.reset();
        cart.addProduct("Electronics", 100L);
        cart.addProduct("Food", 50L);
        assertEquals(150L, cart.getTotal(), "Total before reset should be 150");

        cart.reset();
        assertEquals(0L, cart.getTotal(), "Total after reset should be 0");
    }

    @Test
    void should_ignoreNegativePrices_fast() {
        cart.addProduct("Electronics", -100L);
        assertEquals(0L, cart.getTotal(), "Negative prices should not affect total");
    }
}