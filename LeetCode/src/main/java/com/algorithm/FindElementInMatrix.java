package com.algorithm;

public class FindElementInMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rowIndex = getRowWithTarget(matrix, target);
        return rowIndex == - 1 ? false : searchInRow(matrix[rowIndex], target);
    }

    private int getRowWithTarget(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if ((matrix[mid][0] <= target) && (target <= matrix[mid][matrix[mid].length - 1])) {
                return mid;
            }
            if (target < matrix[mid][0]) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private boolean searchInRow(int[] row, int target) {
        int left = 0;
        int right = row.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (row[mid] == target) {
                return true;
            }
            if (row[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}

