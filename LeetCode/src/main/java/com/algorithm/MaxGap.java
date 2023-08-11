package com.algorithm;

import java.util.PriorityQueue;

public class MaxGap {

    class Bucket {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
    }

    public int maximumGap(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }
        System.out.println("Length: " + n);
        int bucketSize = Math.max(1, (max - min) / (n - 1));
        Bucket[] buckets = new Bucket[(max - min) / bucketSize + 1];
        for (int num : nums) {
            int index = (num - min) / bucketSize;
            if (buckets[index] == null) {
                buckets[index] = new Bucket();
            }
            buckets[index].min = Math.min(buckets[index].min, num);
            buckets[index].max = Math.max(buckets[index].max, num);
        }
        int maxGap = 0;
        int previousMax = min;
        for (Bucket bucket : buckets) {
            if (bucket != null) {
                maxGap = Math.max(maxGap, bucket.min - previousMax);
                previousMax = bucket.max;
            }
        }
        return maxGap;
    }

    public int maximumGapPriorityQueue(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums){
            pq.add(num);
        }
        int max_diff = 0;
        while (pq.size() > 1) {
            Integer poll = pq.poll();
            Integer peek = pq.peek();
            max_diff = Math.max(max_diff, Math.abs(poll - peek));
        }
        return max_diff;
    }

}
