package com.algorithm;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{lowerBoundary(nums, target), upperBoundary(nums, target)};
    }

    private int upperBoundary(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left < right){
            int mid = left + (right - left) / 2;
            if (target >= nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left != 0 && target == nums[left - 1] ? left - 1: - 1;
    }

    private int lowerBoundary(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left != nums.length && target == nums[left] ? left: - 1;
    }
}
