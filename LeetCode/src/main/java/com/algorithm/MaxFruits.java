package com.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/fruit-into-baskets/
 */
public class MaxFruits {
    public int totalFruit(int[] fruits) {
        int start = 0;
        int end;
        int max = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (end = 0; end < fruits.length; end++) {
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);
            count++;
            while (map.size() > 2) {
                map.put(fruits[start], map.get(fruits[start]) - 1);
                if (map.get(fruits[start]) == 0) {
                    map.remove(fruits[start]);
                }
                start++;
                count--;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public int totalFruitOptimal(int[] fruits) {
        int max = 0;
        int currentMax = 0;
        int previousFruit = -1;
        int beforePreviousFruit = -1;
        int previousCount = 0;

        for (int fruit : fruits) {
            if (fruit == previousFruit || fruit == beforePreviousFruit) {
                currentMax++;
            } else {
                max = Math.max(max, currentMax);
                currentMax = previousCount + 1;
            }
            if (fruit == previousFruit) {
                previousCount++;
            } else {
                previousCount = 1;
                beforePreviousFruit = previousFruit;
                previousFruit = fruit;
            }
        }
        return Math.max(max, currentMax);
    }

    public int totalFruitSet(int[] fruits) {
        int left = 0, right = 0, max = 0, count = 0;
        int[] fruitFrequency = new int[fruits.length];
        while (right < fruits.length) {
            if (count <= 2) {
                if (fruitFrequency[fruits[right]] == 0) {
                    count++;
                }
                fruitFrequency[fruits[right]]++;
                right++;
            } else {
                fruitFrequency[fruits[left]]--;
                if (fruitFrequency[fruits[left]] == 0) {
                    count--;
                }
                left++;
            }
            if (count <= 2) {
                max = Math.max(max, right - left);
            }
        }
        return max;
    }
}
