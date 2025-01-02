package org.example.learning;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import javax.management.MXBean;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void calculatorFun() {
        // Test case 1
        assertEquals(10, Calculator.calculatorFun(5, 5, "add"));
        // Test case 2
        assertEquals(0, Calculator.calculatorFun(5, 5, "subtract"));
    }

    // Implement parameterized test for the calculatorFun method
    @ParameterizedTest
    @MethodSource("org.example.learning.CalculatorTest#provideArguments")
    void tesAdd(int a, int b, String operation, int expected) {
        assertEquals(expected, Calculator.calculatorFun(a, b, operation));
    }

    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(5, 5, "add", 10),
                Arguments.of(5, 5, "subtract", 0),
                Arguments.of(5, 5, "multiply", 25),
                Arguments.of(5, 5, "divide", 1)
        );
    }
}