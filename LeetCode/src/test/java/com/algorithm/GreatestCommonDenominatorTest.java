package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDenominatorTest {
    private GreatestCommonDenominator gcm = new GreatestCommonDenominator();

    @Test
    void findGCD() {
        int gcd = gcm.findGCD(60, 96);
        Assertions.assertEquals(12, gcd);
        int gcd1 = gcm.findGCD(20, 8);
        Assertions.assertEquals(4, gcd1);
    }
}