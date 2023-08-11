package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxGapTest {
    @Test
    public void givenArray4_whenMaxGap_thenOk(){
        MaxGap maxGap = new MaxGap();
        int[] nums = {3,6,9,1};
        int gap = maxGap.maximumGap(nums);
        Assertions.assertEquals(3, gap);
        nums = new int[]{1, 1, 1, 1, 1, 5, 5, 5, 5, 5};
        gap = maxGap.maximumGap(nums);
        Assertions.assertEquals(4, gap);
    }

    @Test
    public void givenArray4_whenMaxGap_thenQueueOk(){
        MaxGap maxGap = new MaxGap();
        int[] nums = {3,6,9,1};
        int gap = maxGap.maximumGapPriorityQueue(nums);
        Assertions.assertEquals(3, gap);
        nums = new int[]{1, 1, 1, 1, 1, 5, 5, 5, 5, 5};
        gap = maxGap.maximumGapPriorityQueue(nums);
        Assertions.assertEquals(4, gap);
    }
}
