package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionsOfSmallerNumbersTest {
    private PositionsOfSmallerNumbers positionsOfSmallerNumbers;
    private int[] ints;

    @BeforeEach
    void SetUp(){
        positionsOfSmallerNumbers = new PositionsOfSmallerNumbers();
        ints = new int[]{8, 1, 2, 2, 3};
    }

    @Test
    void smallerNumbersThanCurrentOK() {
        int[] result = positionsOfSmallerNumbers.smallerNumbersThanCurrent(ints);
        Assertions.assertArrayEquals(new int[]{4,0,1,1,3}, result);
    }

    @Test
    void smallerNumbersThanCurrentNoHashOK() {
        int[] result = positionsOfSmallerNumbers.smallerNumbersThanCurrentNoHash(ints);
        Assertions.assertArrayEquals(new int[]{4,0,1,1,3}, result);

    }

    @Test
    void smallerNumbersThanCurrentIfAbsent() {
        int[] result = positionsOfSmallerNumbers.smallerNumbersThanCurrentIfAbsent(ints);
        Assertions.assertArrayEquals(new int[]{4,0,1,1,3}, result);
    }

    @Test
    void smallerNumbersThanCurrentQuickSort() {
        int[] result = positionsOfSmallerNumbers.smallerNumbersThanCurrentQuickSort(ints);
        Assertions.assertArrayEquals(new int[]{4,0,1,1,3}, result);

    }
}