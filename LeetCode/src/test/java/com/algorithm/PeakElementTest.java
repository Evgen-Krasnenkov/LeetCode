package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeakElementTest {
    @Test
    public void givenArray_whenPeakElement_then6(){
        int[] numbers = {1, 2, 1, 3, 5, 6, 4};
        PeakElement peakElement = new PeakElement();
        int index = peakElement.findPeakElement(numbers);
        Assertions.assertEquals(1, index);
    }

}
