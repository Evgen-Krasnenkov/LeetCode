package com.algorithm;

import java.util.Arrays;

public class QuickSort {
    void apply(int[] array, int start, int end){
        if (start < end) {
            int pivotId = partition(array, start, end);
            apply(array, start, pivotId - 1);
            apply(array, pivotId + 1, end);
        }
    }
    private int partition(int[] array, int start, int end){
        int pivot = array[start];
        int low = start + 1;
        int up = end;
        boolean working = true;
        while (working){
            while(low <= up && array[low] <= pivot){
                low++;
            }
            while (up >= low && array[up] >= pivot){
                up--;
            }
            if (up < low) {
                working = false;
            } else {
                swap(array, up, low);
            }
        }
        System.out.println("= DONE =");
        swap(array, start, up);
        return up;
    }

    private void swap(int[] array, int up, int low) {
        System.out.println("Before swap: " + Arrays.toString(array));
        int temp = array[up];
        array[up] = array[low];
        array[low] = temp;
        System.out.println("After swap: " + Arrays.toString(array));
    }
}
