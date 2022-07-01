package com.charlie.calculator;

import org.junit.jupiter.api.Test;

import static com.charlie.calculator.Calculator.add;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CalculatorTest {
    @Test
    void testAdd() {
        assertEquals(3, add(1, 2));

    }

    @Test
    void testAddWithOverflow() {
        try {
            //noinspection ResultOfMethodCallIgnored
            add(2147483647, 1);
            fail();

        } catch (ArithmeticException e) {
            System.out.println("error expected");
        }

    }

    @Test
    void testSubtract() {
        assertEquals(1, Calculator.subtract(2, 1));
    }

    @Test
    void testMultiply() {
        assertEquals(4, Calculator.multiply(2, 2));
    }

    @Test
    void testMultplyithOverflow() {
        try {
            //noinspection ResultOfMethodCallIgnored
            Calculator.multiply((2147483647 / 2) + 1, 2);
            fail();

        } catch (ArithmeticException e) {
            System.out.println("error expected");
        }

    }

    @Test
    void testDivide() {
        assertEquals(1, Calculator.divide(2, 2));
    }

    @Test
    void testDivideWithOverflow() {
        try {
            //noinspection ResultOfMethodCallIgnored
            Calculator.divide(0, 0);
            fail();

        } catch (ArithmeticException e) {
            System.out.println("error expected - dont divide by 0");
        }

    }
}
