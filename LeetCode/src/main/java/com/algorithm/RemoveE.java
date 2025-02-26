package com.algorithm;

/*
* https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
* */
class RemoveE {
    public int removeElement(int[] nums, int val) {
        int valCount = 0;        
        int lastIndex = nums.length;
        int indexToLoop = lastIndex;
        for(int i = 0; i < lastIndex; i++) {
            if (nums[i] == val) {
                lastIndex--;
                if (nums[lastIndex] == val){
                    lastIndex--;
                    valCount++;
                }
                valCount++;
                int temp = nums[lastIndex];
                System.out.println(temp);
                nums[lastIndex] = nums[i];
                nums[i] = temp;
            }
        }
        return valCount;
    }
}