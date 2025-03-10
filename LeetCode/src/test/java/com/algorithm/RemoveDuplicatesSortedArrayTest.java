package com.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesSortedArrayTest {

    private final RemoveDuplicatesSortedArray solution = new RemoveDuplicatesSortedArray();

    @Test
    void testSingleElement() {
        int[] nums = {1};
        assertEquals(1, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1}, trimArray(nums, 1));
    }

    @Test
    void testTwoDifferentElements() {
        int[] nums = {1, 2};
        assertEquals(2, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2}, trimArray(nums, 2));
    }

    @Test
    void testTwoSameElements() {
        int[] nums = {1, 1};
        assertEquals(1, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1}, trimArray(nums, 1));
    }

    @Test
    void testThreeDifferentElements() {
        int[] nums = {1, 2, 3};
        assertEquals(3, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2, 3}, trimArray(nums, 3));
    }

    @Test
    void testThreeSameElements() {
        int[] nums = {2, 2, 2};
        assertEquals(1, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{2}, trimArray(nums, 1));
    }

    @Test
    void testAlternatingDuplicates() {
        int[] nums = {1, 1, 2, 2, 3, 3};
        assertEquals(3, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2, 3}, trimArray(nums, 3));
    }

    @Test
    void testAllUnique() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(5, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, trimArray(nums, 5));
    }

    @Test
    void testAllSameElements() {
        int[] nums = {5, 5, 5, 5, 5};
        assertEquals(1, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{5}, trimArray(nums, 1));
    }

    @Test
    void testDescendingArray() {
        int[] nums = {5, 4, 3, 2, 1}; // Invalid input for sorted array case
        assertEquals(5, solution.removeDuplicates(nums));
    }

    @Test
    void testAlreadyProcessedArray() {
        int[] nums = {1, 2, 3, 4, 5, 5, 5};
        assertEquals(5, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, trimArray(nums, 5));
    }

    @Test
    void testZeroesAndNegatives() {
        int[] nums = {-3, -2, -1, 0, 0, 1, 2};
        assertEquals(6, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{-3, -2, -1, 0, 1, 2}, trimArray(nums, 6));
    }

    @Test
    void testMixedNegativesAndPositives() {
        int[] nums = {-2, -2, 0, 0, 1, 1, 2, 2, 3, 3};
        assertEquals(5, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{-2, 0, 1, 2, 3}, trimArray(nums, 5));
    }

    @Test
    void testLargeArray() {
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = i / 10; // Every number appears 10 times
        }
        assertEquals(100, solution.removeDuplicates(nums));
    }

    @Test
    void testLargeAllSame() {
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = 7;
        }
        assertEquals(1, solution.removeDuplicates(nums));
    }

    @Test
    void testZerosAndOnes() {
        int[] nums = {0, 0, 0, 1, 1, 1};
        assertEquals(2, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{0, 1}, trimArray(nums, 2));
    }

    @Test
    void testSingleNegative() {
        int[] nums = {-1, -1, -1};
        assertEquals(1, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{-1}, trimArray(nums, 1));
    }

    @Test
    void testRepeatedPairs() {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4};
        assertEquals(4, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2, 3, 4}, trimArray(nums, 4));
    }

    @Test
    void testEdgeMinMaxValues() {
        int[] nums = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        assertEquals(2, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}, trimArray(nums, 2));
    }

    @Test
    void testEdgeCaseTwoLargeNumbers() {
        int[] nums = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        assertEquals(1, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{Integer.MAX_VALUE}, trimArray(nums, 1));
    }

    @Test
    void testEdgeCaseMinMaxSeparated() {
        int[] nums = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE};
        assertEquals(3, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, trimArray(nums, 3));
    }

    @Test
    void testMixedZeros() {
        int[] nums = {0, 0, 0, 0, 1, 1, 1, 1};
        assertEquals(2, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{0, 1}, trimArray(nums, 2));
    }

    @Test
    void testZeroLeading() {
        int[] nums = {0, 0, 1, 2, 3};
        assertEquals(4, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{0, 1, 2, 3}, trimArray(nums, 4));
    }

    @Test
    void testZeroEnding() {
        int[] nums = {1, 2, 3, 4, 4, 4};
        assertEquals(4, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2, 3, 4}, trimArray(nums, 4));
    }

    @Test
    void testAlternatingValues() {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        assertEquals(5, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, trimArray(nums, 5));
    }

    private int[] trimArray(int[] nums, int length) {
        int[] trimmed = new int[length];
        System.arraycopy(nums, 0, trimmed, 0, length);
        return trimmed;
    }


}