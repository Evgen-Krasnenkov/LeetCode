package com.algorithm;

public class FindMaxRecursion {
    int apply(int[] array){
        if (array.length < 2) {
            return array[0];
        }
        int firstElement = array[0];
        int[] leftArray = new int[array.length - 1];
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[i + 1];
        }
        int actual = apply(leftArray);
        return Math.max(firstElement, actual);
    }
}
