package com.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NegativePositivePairTest {

    @Test
    void countNegativePositivePairs() {
        int i = new NegativePositivePair().countNegativePositivePairs(new int[]{1, 2, 3, -1, -2, -3});
        assertEquals(3, i);
    }
}