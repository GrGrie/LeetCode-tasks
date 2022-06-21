/*
 * @lc app=leetcode id=542 lang=java
 *
 * [542] 01 Matrix
 */

// @lc code=start
/*class Solution {
    /*
     * Algorithms Study Plan (L1). Day 9.
     */
    /*public int[][] updateMatrix(int[][] mat) {
        
        return mat;
    }

    private void dfs(int[][] matrix){
        

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0) continue;
                else {
                    if(i >= 1 && matrix[i-1][j] == 0) matrix[i][j] = 1;
                    if(i < matrix.length - 1 && matrix[i+1][j] == 0) matrix[i][j] = 1;
                    
                }
            }
        }
        return;
    }
}*/
// @lc code=end

