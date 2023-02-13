package com.algorithm;

public class Fibonacci {
    public int calcFibonacciSum(int n){
        if (n < 2) return n;
        int previous = 0;
        int afterPrevious = 1;
        for (int i = 0; i < n - 1; i++){
            int current = previous + afterPrevious;
            previous = afterPrevious;
            afterPrevious = current;
        }
        return afterPrevious;
    }
    public int calcFibonacciRecursion(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        return calcFibonacciRecursion(n - 2) + calcFibonacciRecursion(n - 1);
    }
}
