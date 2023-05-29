package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxFruitsTest {
    @Test
    void given3Sorts5Trees_when2Baskets_then4FruitsMax() {
        int[] fruits = {1, 2, 3, 2, 2};
        MaxFruits maxFruits = new MaxFruits();
        int totalFruit = maxFruits.totalFruit(fruits);
        Assertions.assertEquals(4, totalFruit);
    }

    @Test
    void given4Sorts11Trees_when2Baskets_then5FruitsMax() {
        int[] fruits = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        MaxFruits maxFruits = new MaxFruits();
        int totalFruit = maxFruits.totalFruit(fruits);
        Assertions.assertEquals(5, totalFruit);
    }

    @Test
    void given3Sorts5TreesSet_when2Baskets_then4FruitsMax() {
        int[] fruits = {1, 2, 3, 2, 2};
        MaxFruits maxFruits = new MaxFruits();
        int totalFruit = maxFruits.totalFruitSet(fruits);
        Assertions.assertEquals(4, totalFruit);
    }

    @Test
    void given4Sorts11TreesSet_when2Baskets_then5FruitsMax() {
        int[] fruits = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        MaxFruits maxFruits = new MaxFruits();
        int totalFruit = maxFruits.totalFruitSet(fruits);
        Assertions.assertEquals(5, totalFruit);
    }

}