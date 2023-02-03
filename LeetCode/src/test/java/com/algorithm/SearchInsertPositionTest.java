package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {
    private static SearchInsertPosition searchInsertPosition;
    @BeforeAll
    static void SetUp() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    void correctIndexOK() {
        int[] ints = {1, 2, 7, 8, 34};
        int actualIndex = searchInsertPosition.searchInsert(ints, 7);
        Assertions.assertTrue(2 == actualIndex);
    }

    @Test
    void correctIndexIfTargetIsMinimumOK() {
        int[] ints = {3, 4, 5, 7, 12};
        int actualIndex = searchInsertPosition.searchInsert(ints, 2);
        Assertions.assertTrue(0 == actualIndex);
    }

    @Test
    void correctIndexIfTargetIsMaximumOK() {
        int[] ints = {0, 2, 4, 6};
        int actualIndex = searchInsertPosition.searchInsert(ints, 8);
        Assertions.assertTrue(4 == actualIndex);
    }

    @Test
    void correctIndexIfTargetShouldBeInMiddle() {
        int[] ints = {12, 14, 17, 22, 30, 34, 41};
        int actualIndex = searchInsertPosition.searchInsert(ints, 20);
        Assertions.assertTrue(3 == actualIndex);
    }

    @Test
    void correctIndexIfNegativeSample() {
        int[] ints = {-3, -2, -1, 1, 2, 3};
        int actualIndex = searchInsertPosition.searchInsert(ints, 0);
        Assertions.assertTrue(3 == actualIndex);
        int[] intSecond = {-245, -210, -101, -99, -80, -71, -60, -2};
        int actualIndexSecond = searchInsertPosition.searchInsert(intSecond, -77);
        Assertions.assertTrue(5 == actualIndexSecond);
    }

    @Test
    void correctIndexMixNegativesPositivesOK() {
        int[] ints = {-1, 3, 5, 7, 7, 7, 11, 12};
        int actualIndex = searchInsertPosition.searchInsert(ints, 8);
        Assertions.assertTrue(6 == actualIndex);
        int[] intSecond = {-1, 3, 5, 7, 7, 7, 11, 12};
        int actualIndexSecond = searchInsertPosition.searchInsert(intSecond, 6);
        Assertions.assertTrue(3 == actualIndexSecond);
    }

    @Test
    void correctIndexMixOptionsOK() {
        int[] ints = {9, 9, 9, 9};
        int actualIndex = searchInsertPosition.searchInsert(ints, 9);
        Assertions.assertTrue(0 == actualIndex);
        int[] intSecond = {};
        int actualIndexSecond = searchInsertPosition.searchInsert(intSecond, 12);
        Assertions.assertTrue(0 == actualIndexSecond);
    }


}
