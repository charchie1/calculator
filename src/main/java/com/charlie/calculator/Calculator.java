package com.charlie.calculator;

import java.util.Collection;

public class Calculator {
    public static int add(int num1, int num2) {
        int r = num1 + num2;
        checkOverflow(num1, num2, r);
        return r;
    }
    public static int add(Collection<Integer> nums){
        int r = 0;
        for(Integer num : nums) {
            r = r + num;
        }
        return r;
    }
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        int r = num1 * num2;
        checkOverflow(num1, num2, r);
        return r;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    private static void checkOverflow(int num1, int num2, int r) {
        if (((num1 ^ r) & (num2 ^ r)) < 0) {
            throw new ArithmeticException("int overflow");
        }
    }

}
