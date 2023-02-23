package com.algorithm;

public class MergeSort {
        void apply(int[] array) {
            if (array.length < 2){
                return;
            }
            int middle = array.length / 2;
            int[] leftArray = new int[middle];
            int[] rightArray = new int[array.length - middle];
            for (int i = 0; i < middle; i++) {
                leftArray[i] = array[i];
            }
            for (int i = middle; i < array.length; i++) {
                rightArray[i - middle] = array[i];
            }
            apply(leftArray);
            apply(rightArray);
            merge(array, leftArray,rightArray);
    }
    void merge(int[] array, int[] leftArray, int[] rightArray){
        int indexLeft = 0;
        int indexRight = 0;
        int indexResult = 0;
        while(indexLeft < leftArray.length && indexRight < rightArray.length){
            if (leftArray[indexLeft] <= rightArray[indexRight]){
                array[indexResult] = leftArray[indexLeft];
                indexLeft++;
            } else {
                array[indexResult] = rightArray[indexRight];
                indexRight++;
            }
            indexResult++;
        }
        while (indexLeft < leftArray.length){
            array[indexResult] = leftArray[indexLeft];
            indexLeft++;
            indexResult++;
        }
        while (indexRight < rightArray.length){
            array[indexResult] = rightArray[indexRight];
            indexRight++;
            indexResult++;
        }
    }
}
