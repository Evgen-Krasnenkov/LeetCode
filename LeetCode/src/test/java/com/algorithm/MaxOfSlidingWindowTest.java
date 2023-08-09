package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxOfSlidingWindowTest {
    @Test
    public  void  givenArray_whenWindow3_then6Max(){
        int[] numbers = {1,3,-1,-3,5,3,6,7};
        MaxOfSlidingWindow maxOfSlidingWindow = new MaxOfSlidingWindow();
        int[] window = maxOfSlidingWindow.maxSlidingWindow(numbers, 3);
        int[] maxs = {3, 3, 5, 5, 6, 7};
        Assertions.assertArrayEquals(maxs, window);
    }

}
