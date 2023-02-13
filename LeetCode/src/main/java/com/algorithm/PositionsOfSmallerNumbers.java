package com.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 **/
public class PositionsOfSmallerNumbers {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.putIfAbsent(temp[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = hashMap.get(nums[i]);
        }
        System.gc();
        return nums;
    }
    public int[] smallerNumbersThanCurrentQuickSort(int[] nums) {
        int[]temp=Arrays.copyOf(nums,nums.length);
        quickSort(temp,0,nums.length-1);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++) map.putIfAbsent(temp[i],i);
        for(int i=0;i<nums.length;i++) nums[i]=map.get(nums[i]);
        return nums;
    }
    public int[] smallerNumbersThanCurrentIfAbsent(int[] nums) {
        int[]temp=Arrays.copyOf(nums,nums.length);
        quickSort(temp, 0, nums.length - 1);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++) map.putIfAbsent(temp[i],i);
        for(int i=0;i<nums.length;i++) nums[i]=map.get(nums[i]);
        return nums;
    }
    private void quickSort(int[]nums,int start,int end){
        int index;
        if(start<end){
            index=partition(nums,start,end,start+((end-start)>>1));
            quickSort(nums,start,index-1);
            quickSort(nums,index+1,end);
        }
    }
    private int partition(int[]nums,int start,int end,int pivot){
        int element=nums[pivot];
        swap(nums,start,pivot);
        int i=start+1;
        for(int j=start+1;j<=end;j++){
            if(nums[j]<element) swap(nums,i++,j);
        }
        swap(nums,--i,start);
        return i;
    }
    private void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int[] smallerNumbersThanCurrentNoHash(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[nums.length];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res[i] = 0;
            } else {
                res[i] = count[nums[i] - 1];
            }
        }
        return res;
    }
}
