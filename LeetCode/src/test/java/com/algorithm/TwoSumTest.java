package com.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void givenArray_whenTwoSum_thenReturnIndices() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] actual = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, actual);
    }

}