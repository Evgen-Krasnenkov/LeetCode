package com.algorithm;

/**
 * Write a function searchInsert that accepts a sorted array of integers nums and a integer target.
 * If the array includes a value equal to target, return its index. If not, return the index where it would be
 * if it were inserted in order.
 *
 * Note: if the array contains several elements equal to target, return the index of the first one.
 *
 * Examples:
 *
 * searchInsert([1, 3, 5, 6], 5) === 2 // 5 has an index 2
 * searchInsert([1, 3, 5, 6], 2) === 1 // 2 would have an index 1
 * searchInsert([1, 3, 5, 6], 0) === 0 // 0 would have an index 0
 * searchInsert([1, 5, 5, 5, 7], 6) === 4 // 6 would have an index 4
 * searchInsert([1], 3) === 1 // 1 would have an index 1
 */
public class SearchInsertPosition {
    /**
     * @param {number[]} nums
     * @param {number} target
     *
     * @returns {number}
     */
    public int searchInsert(int[] nums, int target) {
        int min = 0;
        int max = nums.length;

        while (min < max) {
         int mid = min + (max - min) / 2;

            if (nums[mid] < target) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        if (min != nums.length && nums[min] == target) {
            return min;
        }

        if (max == min) {
            return max;
        }
        return min;
    }
}
