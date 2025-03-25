package com.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntervalsMergeTest {

    @Test
    void merge() {
        IntervalsMerge intervalsMerge = new IntervalsMerge();
        intervalsMerge.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
    }

    @Test
    void merge2intervals() {
        IntervalsMerge intervalsMerge = new IntervalsMerge();
        int[][] merge = intervalsMerge.merge(new int[][]{{1, 4}, {4, 5}});
        assertArrayEquals(new int[][]{{1, 5}}, merge);
    }
}