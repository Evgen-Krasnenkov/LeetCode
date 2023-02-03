package com.algorithm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
public class KthLargestInArray {
    public int findKthLargestBubble(int[] nums, int k) {
        int j = 0;
        boolean swapNeeded = true;
        while(j < nums.length && swapNeeded) {
            swapNeeded = false;
            for (int i = 1; i < nums.length - j; i++) {
                if (nums[i - 1] > nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                    swapNeeded = true;
                }
            }
            if (!swapNeeded){
                break;
            }
            j++;
        }
        return  nums[nums.length - k];
    }

    public void swap (int[] intArray, int left, int right){
        int temp = intArray[right];
        System.out.println(("Array before swap: " + Arrays.toString(intArray)));
        intArray[right] = intArray[left];
        intArray[left] = temp;
        System.out.println(("Array after swap: " + Arrays.toString(intArray)));
    }
    public int findKthLargest(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            int p = makePartition(nums, left, right, mid);
            if (p == nums.length - k){
                return nums[p];
            } else if (p < nums.length - k) {
                left = p + 1;
            } else {
                right = p - 1;
            }
        }
        return -1;
    }

    public int makePartition (int[] intArray, int left, int right, int mid){
        int lastSwapped = left;
        int pivot = intArray[mid];
        System.out.format("left %2d, right %2d, middle index: %2d and its element  - %d \n", left, right, mid, intArray[mid]);
        swap(intArray, mid, right);
        for (int i = lastSwapped; i < right; i++) {
            System.out.format("CHECK index: %d and its element: %2d < mid element %2d \n", i, intArray[i], pivot);
            if (intArray[i] < pivot) {
                System.out.format("index: %2d and its element: %2d REALLY < mid element %2d \n", i, intArray[i], pivot);
                System.out.format("swapping i: %2d and next after LastSwapped: %2d \n", i, lastSwapped);
                swap(intArray, i, lastSwapped++);
            }
        }
        swap(intArray, lastSwapped, right);
        System.out.format("==== Swap back Right: %2d and lastSwapped: %2d with values %2d and %2d = \n", right, lastSwapped, intArray[right], intArray[right], intArray[lastSwapped]);
        return lastSwapped;
    }

    public static void main(String[] args) {
        KthLargestInArray kthLargestInArray = new KthLargestInArray();
        int[] ints;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("LeetCode/src/main/java/partialSort.txt"));
            ints = bufferedReader.lines()
                    .map(x -> x.split(","))
                    .flatMap(Stream::of)
                    .mapToInt(Integer::valueOf)
                    .toArray();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        
//        int kthLargest = kthLargestInArray.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 2);
        int kthLargest = kthLargestInArray.findKthLargest(ints, 10);
        System.out.println("RESULT: " + kthLargest);
    }
}
