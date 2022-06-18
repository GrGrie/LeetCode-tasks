/*
 * @lc app=leetcode id=695 lang=java
 *
 * [695] Max Area of Island
 */

// @lc code=start
class Solution {
    /*
     * Algorithms Study Plan (L1). Day 7.
     */
    private int thisArea = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int maxAreaOfIsland = 0;
        for(int i = 0; i < grid.length; i++){ // i is a row
            for(int j = 0; j < grid[0].length; j++){ // j is a column
                if(grid[i][j] == 1){
                    dfs(grid, i, j);
                    if(thisArea > maxAreaOfIsland)
                        maxAreaOfIsland = thisArea;
                    thisArea = 0;
                }
            }
        }
        return maxAreaOfIsland;
    }

    private void dfs(int[][] grid, int i, int j){
        if(grid[i][j] == 1){       
            thisArea++;
            grid[i][j] = 2; // This is just to mark that we have visited this tile
            if(i + 1 < grid.length) dfs(grid, i+1, j);
            if(i - 1 >= 0) dfs(grid, i-1, j);
            if(j + 1 < grid[0].length) dfs(grid, i, j+1);
            if(j - 1 >= 0) dfs(grid, i, j-1);
        }
        
    }
}
// @lc code=end

