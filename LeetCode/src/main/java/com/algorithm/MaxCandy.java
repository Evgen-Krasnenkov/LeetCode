package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxCandy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        int finalMax = max;
        return Arrays.stream(candies).parallel()
                .mapToObj(num -> ((num + extraCandies) > finalMax))
                .collect(Collectors.toList());
    }
}
