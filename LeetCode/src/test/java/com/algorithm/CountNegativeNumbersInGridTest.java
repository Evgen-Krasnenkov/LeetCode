package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given a m * n matrix grid which is sorted in non-increasing order both row-wise and column-wise.
 *
 * Return the number of negative numbers in grid.
 *
 * Example 1:
 *
 * Input: grid = [
 *   [4, 3, 2, -1],
 *   [3, 2, 1, -1],
 *   [1, 1, -1, -2],
 *   [-1, -1, -2, -3]
 * ]
 * Output: 8
 * Explanation: There are 8 negatives number in the matrix.
 *
 * Example 2:
 *
 * Input: grid = [
 *   [3, 2],
 *   [1, 0]
 * ]
 * Output: 0
 *
 * Example 3:
 *
 * Input: grid = [
 *   [1, -1],
 *   [-1, -1]
 * ]
 * Output: 3
 *
 * Example 4:
 *
 * Input: grid = [ [-1] ]
 * Output: 1
 *
 * Constraints:
 *
 * m == grid.length
 * n == grid[i].length
 * m === n
 * 1 <= m, n <= 2000
 * -100 <= grid[i][j] <= 100
 */
class CountNegativeNumbersInGridTest {
    private CountNegativeNumbersInGrid countNegativeNumbersInGrid;

    @BeforeEach
    void setUp() {
        countNegativeNumbersInGrid = new CountNegativeNumbersInGrid();
    }

    @Test
    void countAllNegativesOK() {
        int[][] ints = {{-100, -100, -100, -100, -100, -100, -100},
                {-99, -99, -99, -99, -99, -99, -99},
                {-98, -98, -98, -98, -98, -98, -98},
                {-1, -1, -1, -1, -1, -1, -1},
                {-2, -2, -2, -2, -2, -2, -2},
                {-5, -5, -5, -5, -5, -5, -5},
                {-10, -10, -10, -10, -10, -10, -10}};
        int numberOfNegatives = countNegativeNumbersInGrid.countNegatives(ints);
        Assertions.assertTrue(49 == numberOfNegatives);
    }

    @Test
    void countAllPositivesOK() {
        int[][] ints = {
                {100, 100, 100, 100, 100, 100, 100},
                {99, 99, 99, 99, 99, 99, 99},
                {98, 98, 98, 98, 98, 98, 98},
                {1, 1, 1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2, 2, 2},
                {5, 5, 5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10, 10, 10},
        };
        int numberOfPositives = countNegativeNumbersInGrid.countNegatives(ints);
        Assertions.assertTrue(0 == numberOfPositives);
    }

    @Test
    void countAllZerosOK() {
        int[][] ints = {
      {0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0},
    };
        int numberOfPositives = countNegativeNumbersInGrid.countNegatives(ints);
        Assertions.assertTrue(0 == numberOfPositives);
    }

}