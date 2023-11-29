package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumShouldReturn1When1Passed() {
        int actual = sumCalculator.sum(1);

        Assertions.assertEquals(1, actual);
    }

    @Test
    void sumShouldReturn6When3Passed() {
        int actual = sumCalculator.sum(3);

        Assertions.assertEquals(6, actual);
    }

    @Test
    void sumShouldThrowIllegalArgumentExceptionWhen0Passed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}
