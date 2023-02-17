package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LargestPositiveWithNegativeTwinTest {

    @Test
    void findLargest() {
        LargestPositiveWithNegativeTwin largestPositiveWithNegativeTwin = new LargestPositiveWithNegativeTwin();
        int largest = largestPositiveWithNegativeTwin.findLargest(
                List.of(-1, 0, 25, 1, 5, 2, 6, -1, 5, 8, 5, -2, -10));
        Assertions.assertEquals(2, largest);
    }

    @Test
    void findLargesSimpleListOk() {
        LargestPositiveWithNegativeTwin largestPositiveWithNegativeTwin = new LargestPositiveWithNegativeTwin();
        int largest = largestPositiveWithNegativeTwin.findLargest(
                List.of(3,2, -2, 5, -3));
        Assertions.assertEquals(3, largest);
    }
    @Test
    void findLargesSingleNegativeOk() {
        LargestPositiveWithNegativeTwin largestPositiveWithNegativeTwin = new LargestPositiveWithNegativeTwin();
        int largest = largestPositiveWithNegativeTwin.findLargest(
                List.of(1, 2, 3, -4));
        Assertions.assertEquals(0, largest);
    }
}