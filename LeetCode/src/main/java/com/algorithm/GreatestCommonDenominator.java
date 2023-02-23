package com.algorithm;

public class GreatestCommonDenominator {
    public int findGCD(int x, int y) {
        while (y != 0) {
            int temp = x;
            x = y;
            y = temp % x;
        }
        return x;
    }
}
