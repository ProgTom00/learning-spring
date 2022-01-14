package com.learning.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        // Given
        // When
        double result1 = calculator.add(2.0, 3.0);
        double result2 = calculator.sub(5.0, 2.0);
        double result3 = calculator.mul(3.0, 3.0);
        double result4 = calculator.div(20.0, 4.0);
        // Then
        assertEquals(5.0, result1);
        assertEquals(3.0, result2);
        assertEquals(9.0, result3);
        assertEquals(5.0, result4);

    }
}
