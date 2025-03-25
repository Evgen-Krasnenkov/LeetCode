package com.algorithm;

/*
https://leetcode.com/problems/two-sum/description/
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> extra = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            Integer difference = target - nums[i];
            if (extra.get(nums[i]) != null) {
                result[0] = extra.get(nums[i]);
                result[1] = i;
                break;
            } else {
                extra.put(difference, i);
            }
        }
        return result;
    }
}
