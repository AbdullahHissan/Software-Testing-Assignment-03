package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceTest {

    @Test
    void should_placeOrder_when_amountPositive() {
        OrderService o = new OrderService();
        assertTrue(o.placeOrder(100));
    }

    @Test
    void should_notPlaceOrder_when_amountZero() {
        OrderService o = new OrderService();
        assertFalse(o.placeOrder(0));
    }

    @Test
    void should_notPlaceOrder_when_amountNegative() {
        OrderService o = new OrderService();
        assertFalse(o.placeOrder(-10));
    }

    @Test
    void should_handleLargeOrder_when_amountHigh() {
        OrderService o = new OrderService();
        assertTrue(o.placeOrder(10000));
    }

    @Test
    void should_notCrash_when_calledMultipleTimes() {
        OrderService o = new OrderService();
        assertDoesNotThrow(() -> {
            o.placeOrder(100);
            o.placeOrder(200);
            o.placeOrder(300);
        });
    }

    @Test
    void should_validateBoundary_when_amountOne() {
        OrderService o = new OrderService();
        assertTrue(o.placeOrder(1));
    }
}