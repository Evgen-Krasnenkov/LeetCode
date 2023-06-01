package com.algorithm;

/**
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 */
public class MinSubArray {
    public int minSubArrayLen(int target, int[] nums) {
        int minSub = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int sum = 0;
        while (start < nums.length) {
            if (sum >= target) {
                minSub = Math.min(minSub, end - start);
                sum -= nums[start];
                start++;
            } else {
                if (end == nums.length) {
                    break;
                }
                sum += nums[end];
                end++;
            }
        }
        return minSub == Integer.MAX_VALUE ? 0 : minSub;
    }
}
