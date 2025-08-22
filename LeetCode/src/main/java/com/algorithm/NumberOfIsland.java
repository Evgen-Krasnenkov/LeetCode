package com.algorithm;

/*
https://leetcode.com/problems/number-of-islands/description/
 */

public class NumberOfIsland {
    public static void main(String[] args) {
        char[][] strings = new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        int i = numIslands(strings);
        System.out.println(i);

    }

    private static void deepFirstSearch(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col > grid[row].length || grid[row][col] == '0') {
            return;
        }
        grid[row][col] = '0';
        deepFirstSearch(grid, row, col + 1);
        deepFirstSearch(grid, row + 1, col);
        deepFirstSearch(grid, row, col - 1);
        deepFirstSearch(grid, row - 1, col);
    }

    private static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[i].length - 1; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    deepFirstSearch(grid, i, j);
                }
            }
        }
        return count;
    }
}
