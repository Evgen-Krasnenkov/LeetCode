package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxGapTest {
    @Test
    public void givenArray4_whenMaxGap_thenOk(){
        MaxGap maxGap = new MaxGap();
        int[] numbers = {3,6,9,1};
        int gap = maxGap.maximumGap(numbers);
        Assertions.assertEquals(3, gap);
    }

}
