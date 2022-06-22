

/*
 * @lc app=leetcode id=542 lang=java
 *
 * [542] 01 Matrix
 */

// @lc code=start

import java.util.LinkedList;
import java.util.Queue;
class Solution {
    /*
     * Algorithms Study Plan (L1). Day 9.
     */
    public int[][] updateMatrix(int[][] mat) {
        
        Queue<int[]> queue = new LinkedList<int[]>();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                // We are adding indexes of 0's in the queue
                if(mat[i][j] == 0)
                    queue.add(new int[]{i,j});
                // If it is 1, we change it to -1 to mark, that this is not visited point
                else
                    mat[i][j] = -1;
            }
        }

        int[][] directions = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        int distance = 0;
        // Single BFS from 0
        while(!queue.isEmpty()){
            int size = queue.size();
            // Distance is the distance to cell = 0. 
            distance++;
            while(size > 0){
                int[] cell = queue.poll();
                // From this current cell we check all possible adjecent cells
                // For this we add possible combinations of -1,0,1 to this cell
                for(int[] direction : directions){
                    int row = cell[0] + direction[0];
                    int col = cell[1] + direction[1];
                    // If the result coordinates are invalid, than do nothing. As well as do nothing for 0s
                    if(row < 0 || col < 0 || row == mat.length || col == mat[0].length || mat[row][col] != -1)
                        continue;
                    // If the cell is valid, then set its value to the distance
                    mat[row][col] = distance;
                    // And add this cell to the queue to check its neighbours
                    queue.add(new int[]{row,col});
                }
                size--;
            }
        }
        return mat;
    }

    
    
}
// @lc code=end

