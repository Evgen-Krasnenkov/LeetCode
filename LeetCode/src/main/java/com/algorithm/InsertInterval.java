package com.algorithm;

import java.util.ArrayList;
import java.util.List;
/**
 * https://leetcode.com/problems/insert-interval/description/
**/

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            list.add(intervals[i]);
            i++;
        }
        while (i < intervals.length && newInterval[1] >= intervals[i][0]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        list.add(newInterval);
        while (i < intervals.length) {
            list.add(intervals[i]);
            i++;
        }

        int[][] result = new int[list.size()][2];

        for (
                int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }
}
