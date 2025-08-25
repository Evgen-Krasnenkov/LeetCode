package com.algorithm;
/*
https://leetcode.com/problems/squares-of-a-sorted-array/description/
 */
public class MergeTwoSorted {
    public static void main(String[] args) {
        int[] arr = new int[] {-4,-1,0,3,10};
        int[] ints1 = sortedSquares(arr);
        int[] ints = {1, 2, 3, 0, 0, 0};
//        merge(ints, 3, new int []{2,5,6}, 3);
        ints = new int []{0};
        merge(ints, 0, new int []{1}, 1);
        System.out.println(ints);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = n - 1;
        int right = n + m - 1;
        for (int i = m - 1; i >= 0 && index >= 0; i--){
            if(nums1[i] > nums2[index]){
                nums1[right--] = nums1[i];
            } else {
                nums1[right--] = nums2[index--];
                i++;
            }
        }
    }
    public static int[] sortedSquares(int[] nums) {
        int [] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int pos = right;
        while(left < right) {
            int itemR = nums[right] * nums[right];
            int itemL = nums[left] * nums[left];
            if (itemR > itemL) {
                result[pos] = itemR;
                right--;
            } else {
                result[pos] = itemL;
                left++;
            }
            pos--;
        }
        return result;
    }
}
