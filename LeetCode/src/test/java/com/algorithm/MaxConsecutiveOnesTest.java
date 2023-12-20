package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {

    @Test
    public void whenMax_thenSuccess(){
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int i = maxConsecutiveOnes.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2);
        Assertions.assertTrue(6 == i);

    }

    @Test
    public void whenMax3_thenSuccess(){
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int i = maxConsecutiveOnes.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3);
        Assertions.assertTrue(10 == i);

    }

}
