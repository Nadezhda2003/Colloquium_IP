package com.example.calculatorwebservice;

public class CalculatorEngine {
    public static double Add(double arg1, double arg2) {
        return arg1 + arg2;
    }
    public static double Minus(double arg1, double arg2) {
        return arg1 - arg2;
    }
    public static double Multiply(double arg1, double arg2) {
        return arg1 * arg2;
    }
    public static double Divide(double arg1, double arg2) {
        if (arg2 == 0) {
            throw new IllegalArgumentException("Divide by zero!");
        }
        return arg1 / arg2;
    }
}