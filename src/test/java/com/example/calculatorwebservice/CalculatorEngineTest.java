package com.example.calculatorwebservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorEngineTest {
    
    @Test
    void add() {
        double a=12, b=5;
        Assertions.assertEquals(a+b, CalculatorEngine.Add(a, b));
    }

    @Test
    void minus() {
        double a=12, b=5;
        Assertions.assertEquals(a-b, CalculatorEngine.Minus(a, b));
    }

    @Test
    void multiply() {
        double a=12, b=5;
        Assertions.assertEquals(a*b, CalculatorEngine.Multiply(a, b));
    }

    @Test
    void divide() {
        double a=12, b=5;
        Assertions.assertEquals(a/b, CalculatorEngine.Divide(a, b));
    }
}