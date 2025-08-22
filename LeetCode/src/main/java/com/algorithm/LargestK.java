package com.algorithm;

import java.util.PriorityQueue;

public class LargestK {
    public static void main(String[] args) {
        int kthLargest = findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);
        PriorityQueue<Object> heap = new PriorityQueue<>();
        System.out.println(kthLargest);
    }

    private static int findKthLargest(int[] nums, int k) {
        int j = 0;
        boolean swapNeeded = true;
        while (j < nums.length && swapNeeded) {
            swapNeeded = false;
            for (int i = 1; i < nums.length - j; i++) {
                if (nums[i - 1] > nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                    swapNeeded = true;
                }
            }
            if (!swapNeeded) {
                break;
            }
            j++;
        }
        return nums[nums.length - k];
    }
}
