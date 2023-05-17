package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertIntervalTest {
    @Test
    void givenIntervals_whenInsert_thenSuccess() {
        int[][] input = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] insert = {4, 8};
        int[][] expected = {{1, 2}, {3, 10}, {12, 16}};
        InsertInterval insertInterval = new InsertInterval();
        int[][] actual = insertInterval.insert(input, insert);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void givenIntervalsEmpty_whenInsert_thenSuccess() {
        int[][] input = {};
        int[] insert = {5, 7};
        int[][] expected = {{5, 7}};
        InsertInterval insertInterval = new InsertInterval();
        int[][] actual = insertInterval.insert(input, insert);
        Assertions.assertArrayEquals(expected, actual);
    }

}