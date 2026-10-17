package Q120;

import java.util.List;

public class Q120_sol {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                grid[i][j] = triangle.get(i).get(j);
            }
        }
        for (int i = n - 2; i >= 0; i--){
            for (int j = 0; j <= i; j++){
                grid[i][j] += Math.min(grid[i + 1][j +  1], grid[i + 1][j]);
            }
        }
        return grid[0][0];
    }
}
