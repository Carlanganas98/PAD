package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorUnitTest {

    @Test
    public void addition_isCorrect() {
        Calculator c = new Calculator();
        assertEquals(3, c.add(1,2),0);
    }
}
