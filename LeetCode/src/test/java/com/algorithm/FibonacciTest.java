package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Test
    void calcFibonacciSum() {
        Fibonacci fibonacci = new Fibonacci();
        int i = fibonacci.calcFibonacciSum(4);
        Assertions.assertEquals(3, i);
        i = fibonacci.calcFibonacciSum(3);
        Assertions.assertEquals(2, i);
        i = fibonacci.calcFibonacciSum(2);
        Assertions.assertEquals(1, i);
    }

    @Test
    void calcFibonacciRecursion() {
        Fibonacci fibonacci = new Fibonacci();
        int i = fibonacci.calcFibonacciRecursion(4);
        Assertions.assertEquals(3, i);
         i = fibonacci.calcFibonacciRecursion(3);
        Assertions.assertEquals(2, i);
         i = fibonacci.calcFibonacciRecursion(2);
        Assertions.assertEquals(1, i);
    }
}