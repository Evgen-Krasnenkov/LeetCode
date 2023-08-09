package com.algorithm;

import java.util.Arrays;

public class RecursiveSelectionSort {
    public static void main(String[] args) {
        String input = "12 45 23 67 34 89";
        int[] arr = convertStringToArray(input);
        selectionSort(arr, 0);
        System.out.println(Arrays.toString(arr)); // Output: [12, 23, 34, 45, 67, 89]
    }

    public static int[] convertStringToArray(String input) {
        String[] parts = input.split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        return arr;
    }

    public static void selectionSort(int[] arr, int index) {
        if (index == arr.length - 1) return;

        int minIdx = findMinIndex(arr, index);
        int temp = arr[index];
        arr[index] = arr[minIdx];
        arr[minIdx] = temp;

        selectionSort(arr, index + 1);
    }

    public static int findMinIndex(int[] arr, int start) {
        int minIdx = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }
}
