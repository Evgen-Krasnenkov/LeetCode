package com.algorithm;

public class BubbleSort {
    void apply(int [] array){
        for (int j = array.length - 1; j > 0; j--) {
            for (int i = 0; i < j ; i++) {
                if (array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}
