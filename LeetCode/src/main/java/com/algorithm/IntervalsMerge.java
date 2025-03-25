package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class IntervalsMerge {
    public int[][] merge(int[][] intervals) {
        int row = 0;
        List<Integer[]> result = new ArrayList<>();
        while (row < intervals.length - 1) {
            Integer[] first = new Integer[2];
            if (intervals[row][1] < intervals[row + 1][0]) {
                first[0] = intervals[row][0];
                first[1] = intervals[row][1];
                result.add(first);
                row++;
            } else {

                while ((intervals[row][1] >= intervals[row + 1][0]) && (row < intervals.length - 1)) {
                    first[0] = intervals[row][0];
                    if (intervals[row][1] >= intervals[row + 1][1]) {
                        first[1] = intervals[row][1];
                    } else {
                        first[1] = intervals[row + 1][1];
                    }
                    row++;
                }
                result.add(first);
                row++;
            }
        }
        int[][] sum = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            sum[i][0] = result.get(i)[0];
            sum[i][1] = result.get(i)[1];
        }
        return sum;
    }
}
