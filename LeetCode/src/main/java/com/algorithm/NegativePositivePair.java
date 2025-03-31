package com.algorithm;

import java.util.HashMap;
import java.util.Map;

public class NegativePositivePair {
    public int countNegativePositivePairs(int[] array) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number: array) {
            int extra = - number;
            if (map.getOrDefault(extra, 0) > 0) {
                count++;
                map.put(extra, map.getOrDefault(extra, 0) - 1);
            } else {
                map.put(number, map.getOrDefault(number, 0) + 1);
            }
        }
        return count;
    }
}
