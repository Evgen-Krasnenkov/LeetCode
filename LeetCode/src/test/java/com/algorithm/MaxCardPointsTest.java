package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxCardPointsTest {
    @Test
    void given3IntSame_whenPick2_then4() {
        MaxCardPoints maxCardPoints = new MaxCardPoints();
        int actual = maxCardPoints.maxScore(new int[]{2, 2, 2}, 2);
        Assertions.assertEquals(4, actual);
    }

    @Test
    void given7Ints_whenPick7_then55() {
        MaxCardPoints maxCardPoints = new MaxCardPoints();
        int actual = maxCardPoints.maxScore(new int[]{9, 7, 7, 9, 7, 7, 9}, 7);
        Assertions.assertEquals(55, actual);
    }

    @Test
    void given7Ints_whenPick3_then12() {
        MaxCardPoints maxCardPoints = new MaxCardPoints();
        int actual = maxCardPoints.maxScore(new int[]{1, 2, 3, 4, 5, 6, 1}, 3);
        Assertions.assertEquals(12, actual);
    }

    @Test
    void given8Ints_whenPick3_then202() {
        MaxCardPoints maxCardPoints = new MaxCardPoints();
        int actual = maxCardPoints.maxScore(new int[]{1, 79, 80, 1, 1, 1, 200, 1}, 3);
        Assertions.assertEquals(202, actual);
    }

    @Test
    void given6Ints_whenPick3_then248() {
        MaxCardPoints maxCardPoints = new MaxCardPoints();
        int actual = maxCardPoints.maxScore(new int[]{100, 40, 17, 9, 73, 75}, 3);
        Assertions.assertEquals(248, actual);
    }

    @Test
    void given9Ints_whenPick8_then248() {
        MaxCardPoints maxCardPoints = new MaxCardPoints();
        int actual = maxCardPoints.maxScore(new int[]{96, 90, 41, 82, 39, 74, 64, 50, 30}, 8);
        Assertions.assertEquals(536, actual);
    }
}