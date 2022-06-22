

/*
 * @lc app=leetcode id=994 lang=java
 *
 * [994] Rotting Oranges
 */

// @lc code=start
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    /*
     * Leetcode Study Plan (L1). Day 9.
     */
    // [[2,1,1],[0,1,1],[1,0,1]]
    // [[0,2]]
    // [[0]]
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2)
                    queue.add(new int[]{i,j});
                if(grid[i][j] == 1)
                    grid[i][j] = -1;
            }
        }

        int[][] directions = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        int distance = 0;
        boolean madeChanges = false;

        while(!queue.isEmpty()){
            madeChanges = false;
            int size = queue.size();
            distance++;
            while(size > 0){
                int[] cell = queue.poll();
                for(int[] direction : directions){
                    int row = cell[0] + direction[0];
                    int col = cell[1] + direction[1];

                    if(row < 0 || col < 0 || row == grid.length || col == grid[0].length
                    || grid[row][col] != -1)
                        continue;
                    if(grid[row][col] == -1){
                        madeChanges = true;
                        grid[row][col] = distance;
                        queue.add(new int[]{row,col});
                    }
                }
                size--;
            }
            if(!madeChanges) distance--;
        }

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == -1)
                    return -1;
            }
        }
        return distance;
    }
}
// @lc code=end

