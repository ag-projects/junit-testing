package com.agharibi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    void testEqualityDollar() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(8));
        assertNotEquals(Money.dollar(5), Money.Franc(5));
    }

    @Test
    void testMultiplicationFranc() {
        Money five = Money.Franc(5);
        assertEquals(Money.Franc(10), five.times(2));
        assertEquals(Money.Franc(15), five.times(3));
    }

    @Test
    void testEqualityFranc() {
        assertEquals(Money.Franc(5), Money.Franc(5));
        assertNotEquals(Money.Franc(5), Money.Franc(8));
    }


}
