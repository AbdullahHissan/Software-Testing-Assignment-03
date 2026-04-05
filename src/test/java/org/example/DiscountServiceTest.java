package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountServiceTest {

    @Test
    void should_applyDiscount_when_amountGreaterThan1000() {
        DiscountService d = new DiscountService();
        assertEquals(1100, d.applyDiscount(1200));
    }

    @Test
    void should_notApplyDiscount_when_amountLessThan1000() {
        DiscountService d = new DiscountService();
        assertEquals(900, d.applyDiscount(900));
    }

    @Test
    void should_notApplyDiscount_when_amountEquals1000() {
        DiscountService d = new DiscountService();
        assertEquals(1000, d.applyDiscount(1000));
    }

    @Test
    void should_handleZeroAmount_when_amountIsZero() {
        DiscountService d = new DiscountService();
        assertEquals(0, d.applyDiscount(0));
    }

    @Test
    void should_handleNegativeAmount_when_amountIsNegative() {
        DiscountService d = new DiscountService();
        assertEquals(-100, d.applyDiscount(-100));
    }

    @Test
    void should_applyCorrectDiscount_when_largeAmount() {
        DiscountService d = new DiscountService();
        assertEquals(4900, d.applyDiscount(5000));
    }

    @Test
    void should_notCrash_when_calledMultipleTimes() {
        DiscountService d = new DiscountService();
        assertDoesNotThrow(() -> d.applyDiscount(100));
    }

    @Test
    void should_returnSameAmount_when_noDiscountApplied() {
        DiscountService d = new DiscountService();
        assertEquals(800, d.applyDiscount(800));
    }
}