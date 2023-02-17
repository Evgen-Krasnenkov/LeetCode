package com.algorithm;

import java.util.List;

/**
 * Given an array A of N integers, returns the largest integer K > 0 such that both values K and -K exist in array A.
 * If there is no such integer, the function should return 0.
 */
public class LargestPositiveWithNegativeTwin {
    public int findLargest(List<Integer> inputList){
        int currentMax = 0;
        for (Integer element :
                inputList) {
            if (inputList.contains( -element)) {
                currentMax = Math.max(currentMax, Math.abs(element));
            }
        }
        return currentMax;
    }

}
