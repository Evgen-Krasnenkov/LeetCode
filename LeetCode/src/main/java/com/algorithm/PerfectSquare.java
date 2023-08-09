package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/perfect-squares/
 */
public class PerfectSquare {
    public int numSquares(int n) {
//        int[] dp = new int[n + 1];
//        Arrays.fill(dp, n);
//        dp[0] = 0;
//        for (int i = 0; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                int square = j * j;
//                if (i - square < 0) {
//                    break;
//                } else {
//                    dp[i] = Math.min(dp[i], 1 + dp[i - square]);
//                }
//            }
//        }
//        return dp[n];

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        List<Integer> squares = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            squares.add(i * i);
        }
        for (int i = 1; i <= n; i++) {
            for (Integer square : squares) {
                if (i - square >= 0 && dp[i - square] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - square] + 1);
                }
            }
        }
        return dp[n] == Integer.MAX_VALUE ? -1 : dp[n];
    }
}

