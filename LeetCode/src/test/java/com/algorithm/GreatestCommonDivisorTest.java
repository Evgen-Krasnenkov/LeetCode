package com.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    void gcdOfStrings() {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        String gcd = greatestCommonDivisor.gcdOfStrings("ABCABC", "ABC");
        assertEquals("ABC", gcd);
    }

    @Test
    void gcdOfStringsNoResult() {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        String gcd = greatestCommonDivisor.gcdOfStrings("LEET", "CODE");
        assertEquals("", gcd);
    }

    @Test
    void gcdOfStringsLengthTwo() {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        String gcd = greatestCommonDivisor.gcdOfStrings("ABABAB", "ABAB");
        assertEquals("AB", gcd);
    }
}