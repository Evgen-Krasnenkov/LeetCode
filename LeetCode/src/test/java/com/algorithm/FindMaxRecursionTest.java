package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxRecursionTest {

    @Test
    void apply() {
        FindMaxRecursion findMaxRecursion = new FindMaxRecursion();
        int actual = findMaxRecursion.apply(new int[]{6, 20, 8, 19, 56, 23, 87, 41, 49, 53});
        Assertions.assertEquals(87, actual);
        int actual2 = findMaxRecursion.apply(new int[]{60, 120, 187, 85, 56, 23, 87, 41, 49, 53});
        Assertions.assertEquals(187, actual2);
    }
}