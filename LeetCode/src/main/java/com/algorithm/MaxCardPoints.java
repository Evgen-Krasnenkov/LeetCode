package com.algorithm;

/**
 * https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards
 */
public class MaxCardPoints {
    public int maxScore(int[] cardPoints, int k) {
        int right = cardPoints.length - 1;
        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;
        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }
        totalSum = leftSum;
        for (int i = 0; i < k; i++) {
            leftSum -= cardPoints[k - i - 1];
            rightSum += cardPoints[right - i];
            totalSum = Math.max(totalSum, leftSum + rightSum);
        }
        return totalSum;
    }
}
