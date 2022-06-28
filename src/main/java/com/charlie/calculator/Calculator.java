package com.charlie.calculator;

public class Calculator {
        public static int add (int num1, int num2 )
        {
                int r = num1 + num2;
                if (((num1 ^ r) & (num2 ^ r)) < 0) {
                        throw new ArithmeticException("int overflow");
                }
                return r;
        }
        public static int subtract (int num1, int num2 )
        {return num1 - num2;}
        public static int multiply (int num1, int num2 )
        {
                int r = num1 * num2;
                if (((num1 ^ r) & (num2 ^ r)) < 0) {
                        throw new ArithmeticException("int overflow");
                }
                return r;}
        public static int divide (int num1, int num2 )
        {return num1 / num2;}

        }
