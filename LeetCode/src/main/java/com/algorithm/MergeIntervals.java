package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode.com/problems/merge-intervals/
 */
public class MergeIntervals {
    private static final int START = 0;
    private static final int END = 1;
    private static final boolean PRESENT = true;
    public int[][] mergeSingle(int[][] intervals){
        final int START = 0;
        final int END = 1;
        if(intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(x -> x[START]));
        int max = Integer.MIN_VALUE;
        for (int[] interval :
                intervals) {
            max = Math.max(interval[END], max);
        }
        List<int[]> intervalList = new ArrayList<>();
        for(int i = 0; i < intervals.length - 1; i++){
            if(intervals[i][END] >= intervals[i + 1][START]){
                if(intervals[i][START] > intervals[i + 1][START]){
                    intervalList.add(new int[]{intervals[i + 1][START], intervals[i + 1][END]});
                    i++;
                } else {
                    intervalList.add(new int[]{intervals[i][START], intervals[i + 1][END]});
                    i++;
                }
            } else {
                intervalList.add(new int[]{intervals[i][START], intervals[i][END]});
            }
        }
        if(intervals[intervals.length - 1][START] <= intervals[intervals.length - 2][END]){
            int[] ints = intervalList.get(intervalList.size() - 1);
            ints[END] = max;
            intervalList.set(intervalList.size() - 1, ints);
        } else {
            intervalList.add(intervals[intervals.length - 1]);
        }
        return intervalList.toArray(new int[intervalList.size()][]);
    }



    public int[][] mergeCustom(int[][] intervals){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] interval :
                intervals) {
            min = Math.min(interval[START], min);
            max = Math.max(interval[END], max);
        }
        boolean[] references = new boolean[max + 1];
        for (int[] interval :
                intervals) {
            for (int i = interval[START]; i <= interval[END] ; i++) {
                references[i] = PRESENT;
            }
        }
        List<int[]> intervalList = new ArrayList<>();
        int start = min;
        int end = min;
        int i = min + 1;
        while(i < references.length - 1) {
            int j = i;
            while (j < references.length - 1 && references[j]) {
                if (!references[j - 1]) {
                    start = j;
                }
                if (!references[j + 1]) {
                    end = j;
                    intervalList.add(new int[]{start, end});
                }
                j++;
            }
            i = j + 1;
        }
        int[] lastInts = {start, max};
        intervalList.add(lastInts);
        return intervalList.toArray(new int[intervalList.size()][]);
    }
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals, (x,y) -> Integer.compare(x[START], y[START]));
        List<int[]> ints = new ArrayList<>();
        int[] modifiedIntervals = intervals[START];
        ints.add(modifiedIntervals);
        for (int[] interval :
                intervals) {
            if(interval[START] <= modifiedIntervals[END]){
                modifiedIntervals[END] = Math.max(interval[END], modifiedIntervals[END]);
        } else {
                modifiedIntervals = interval;
                ints.add(modifiedIntervals);
            }
        }
        return ints.toArray(new int[ints.size()][]);
    }

    public int[][] mergeOptimal(int[][] intervals) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int[] inv: intervals){
            min = Math.min(min, inv[0]);
            max = Math.max(max, inv[1]);
        }
        int[] prefixSum = new int[(max-min)*2+2];
        for(int[] inv: intervals){
            prefixSum[(inv[0]-min)*2]++;
            prefixSum[(inv[1]-min)*2+1]--;
        }
        for(int i = 1; i<prefixSum.length;i++){
            prefixSum[i] += prefixSum[i-1];
        }
        int start = 0;
        int end = 0;
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i<prefixSum.length;i++){
            if(prefixSum[i]>0 && (i == 0 || prefixSum[i-1] == 0)){
                start = i;
            }
            if(prefixSum[i] == 0 && i>0 && prefixSum[i-1]>0){
                end = i-1;
                list.add(new int[]{start/2+min, end/2+min});
            }
        }
        int[][] res = new int[list.size()][2];
        for(int i = 0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
