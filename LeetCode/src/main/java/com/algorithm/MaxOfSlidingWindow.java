package com.algorithm;

public class MaxOfSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] maxs = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length - k + 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                if (max < nums[j]) {
                    max = nums[j];
                }
            }
            maxs[i] = max;
        }
        return maxs;
    }
}
