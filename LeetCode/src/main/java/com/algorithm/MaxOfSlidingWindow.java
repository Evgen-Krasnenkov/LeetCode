package com.algorithm;

import java.util.Deque;
import java.util.LinkedList;

public class MaxOfSlidingWindow {

    public int[] maxSlidingWindowDeque(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> window = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!window.isEmpty() && window.peek() < i - k + 1) {
                window.poll();
            }
            while (!window.isEmpty() && nums[window.peekLast()] < nums[i]) {
                window.pollLast();
            }
            window.offer(i);
            if (i >= k - 1) {
                result[i - k + 1] = nums[window.peek()];
            }
        }
        return result;
    }

    public int[] maxSlidingWindowAlex(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int maxIndex = -1;
        int i = 0;
        result[i] = Integer.MIN_VALUE;
        for (int j = i; j < i + k; j++) {
            if (result[i] < nums[j]) {
                result[i] = nums[j];
                maxIndex = j;
            }
        }
        do {
            i++;
            if (maxIndex > i) {
                if (nums[maxIndex] < nums[i + k - 1]) {
                    result[i] = nums[i + k - 1];
                    maxIndex = i + k - 1;
                } else {
                    result[i] = nums[maxIndex];
                    maxIndex = maxIndex;
                }
            } else {
                int show = i + k - 1;
                System.out.println("nums length: " + nums.length + "! i + k - 1: " + show);
                if (nums[maxIndex] < nums[i + k - 1]) {
                    result[i] = nums[i + k - 1];
                    maxIndex = i + k - 1;
                } else {
                    result[i] = Integer.MIN_VALUE;
                    for (int j = i; j < i + k; j++) {
                        if (result[i] < nums[j]) {
                            result[i] = nums[j];
                            maxIndex = j;
                        }
                    }
                }
            }
        } while (i < nums.length - k);
        return result;
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = nums[0];
        rightMax[n - 1] = nums[n - 1];

        // Compute left maxima for each block
        for (int i = 1; i < n; i++) {
            leftMax[i] = (i % k == 0) ? nums[i] : Math.max(leftMax[i - 1], nums[i]);
        }

        // Compute right maxima for each block
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = (i % k == k - 1) ? nums[i] : Math.max(rightMax[i + 1], nums[i]);
        }

        int[] maxs = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++) {
            maxs[i] = Math.max(rightMax[i], leftMax[i + k - 1]);
        }

        return maxs;
    }

    public int[] maxSlidingWindowLoop(int[] nums, int k) {
        int[] maxs = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length - k + 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                if (max < nums[j]) {
                    max = nums[j];
                }
            }
            maxs[i] = max;
        }
        return maxs;
    }
}
