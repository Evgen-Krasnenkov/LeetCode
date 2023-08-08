package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PerfectSquareTest {

    @Test
    public void given12_whenPerfectSqr_thenThree() {
        PerfectSquare perfectSquare = new PerfectSquare();
        int squares = perfectSquare.numSquares(12);
        Assertions.assertEquals(3, squares);
    }

}
