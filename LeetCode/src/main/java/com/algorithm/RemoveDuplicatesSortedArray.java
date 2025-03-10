package com.algorithm;

/*
* https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
* */
public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
