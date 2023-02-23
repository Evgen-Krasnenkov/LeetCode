package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void apply() {
        QuickSort quickSort = new QuickSort();
        int[] array = new int[]{123, 23, 45, 56, 78, 1, 5, 3, 2, 9};
        quickSort.apply(array, 0, array.length - 1);
        boolean check = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]){
                check = false;
            }
        }
        Assertions.assertTrue(check);
    }
}