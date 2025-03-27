package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindElementInMatrixTest {

    @Test
    void searchMatrix() {
        FindElementInMatrix findElementInMatrix = new FindElementInMatrix();
        boolean b = findElementInMatrix.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3);
        Assertions.assertTrue(b);
    }

    @Test
    void searchMatrixTarget13() {
        FindElementInMatrix findElementInMatrix = new FindElementInMatrix();
        boolean b = findElementInMatrix.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13);
        Assertions. assertTrue(b);
    }

    @Test
    void searchMatrixTarget1() {
        FindElementInMatrix findElementInMatrix = new FindElementInMatrix();
        boolean b = findElementInMatrix.searchMatrix(new int[][]{{1}}, 1);
        Assertions.assertTrue(b);
    }

    @Test
    void searchMatrixTargetOneOne() {
        FindElementInMatrix findElementInMatrix = new FindElementInMatrix();
        boolean b = findElementInMatrix.searchMatrix(new int[][]{{1, 1}}, 1);
        Assertions. assertTrue(b);
    }

    @Test
    void searchMatrixTargetTwoOneOne() {
        FindElementInMatrix findElementInMatrix = new FindElementInMatrix();
        boolean b = findElementInMatrix.searchMatrix(new int[][]{{1, 1}}, 2);
        Assertions. assertTrue(b);
    }

    @Test
    void searchMatrixTargetThreeOneThree() {
        FindElementInMatrix findElementInMatrix = new FindElementInMatrix();
        boolean b = findElementInMatrix.searchMatrix(new int[][]{{1, 3}}, 3);
        Assertions. assertTrue(b);
    }
}