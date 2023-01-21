public class MinSumGrid {
    public static int minPathSum(int[][] grid) {
        // returns min sum of path from left-top to right bottom of grid
        int h = grid.length;
        int w = grid[0].length;
        int[][] result = new int[h][w];
        for (int row = 0; row < h; ++row) {
            for (int col = 0; col < w; col++){
                if (row == 0 &&  col == 0) {
                    result[row][col] = grid[row][col];
                } else {
                    result[row][col] = grid[row][col] + Math.min(
                            (row == 0 ? Integer.MAX_VALUE : result[row - 1][col]),
                            (col == 0 ? Integer.MAX_VALUE : result[row][col - 1]));
                }
            }
        }
        return result[h - 1][w - 1];
    }
    public static void main(String[] args) {
        int[][] grid = {{1,2},{5,6},{1,1}};
        System.out.println(minPathSum(grid));
    }
}
