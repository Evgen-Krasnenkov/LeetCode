package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void apply() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[]{123, 23, 45, 56, 78, 1, 5, 3, 2, 9};
        bubbleSort.apply(array);
        Assertions.assertTrue(isSorted(array));
    }

    boolean isSorted(int[] array){
        for (int i = 1; i < array.length; i++) {
            if(array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }
}