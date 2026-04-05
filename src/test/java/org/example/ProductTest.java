package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    void should_returnCorrectPrice_when_productCreated() {
        Product p = new Product();
        assertEquals(100, p.getPrice());
    }

    @Test
    void should_returnCorrectName_when_productCreated() {
        Product p = new Product();
        assertEquals("Apple", p.getName());
    }

    @Test
    void should_allowZeroPrice_when_priceIsZero() {
        Product p = new Product("Orange", 0);
        assertEquals(0, p.getPrice());
    }

    @Test
    void should_allowNegativePrice_when_priceIsNegative() {
        Product p = new Product("Defective", -50);
        assertEquals(-50, p.getPrice());
    }

    @Test
    void should_handleLargePrice_when_priceIsHigh() {
        Product p = new Product("Luxury", 100000);
        assertEquals(100000, p.getPrice());
    }

    @Test
    void should_notCrash_when_nameIsEmpty() {
        Product p = new Product("", 10);
        assertEquals("", p.getName());
    }

    @Test
    void should_notCrash_when_nameIsNull() {
        Product p = new Product(null, 10);
        assertNull(p.getName());
    }
}