package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinSubArrayTest {
    @Test
    void given7and6IntArray_whenApply_then2(){
        int[] array = {2,3,1,2,4,3};
        int target = 7;
        MinSubArray minSubArray = new MinSubArray();
        int actual = minSubArray.minSubArrayLen(target, array);
        Assertions.assertEquals(2,actual);
    }

    @Test
    void givenTargetEqualElement_whenApply_then1(){
        int[] array = {1,4,4};
        int target = 4;
        MinSubArray minSubArray = new MinSubArray();
        int actual = minSubArray.minSubArrayLen(target, array);
        Assertions.assertEquals(1,actual);
    }
    @Test
    void givenTargetMoreTotal_whenApply_then0(){
        int[] array = {1,1,1,1,1,1,1,1};
        int target = 0;
        MinSubArray minSubArray = new MinSubArray();
        int actual = minSubArray.minSubArrayLen(target, array);
        Assertions.assertEquals(0,actual);
    }

}