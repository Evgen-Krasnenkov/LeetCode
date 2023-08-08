package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/perfect-squares/
 */
public class PerfectSquare {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        List<Integer> squares = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            squares.add(i * i);
        }
        for (int i = 1; i < squares.size(); i++) {
            for (Integer square : squares) {
                if (i - square >= 0 && dp[i - square] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - square] + 1);
                }
            }
        }
        return dp[n] == Integer.MAX_VALUE ? -1 : dp[n];
    }
}

