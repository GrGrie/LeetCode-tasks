/*
 * @lc app=leetcode id=867 lang=java
 *
 * [867] Transpose Matrix
 */

// @lc code=start
class Solution {
    public int[][] transpose(int[][] matrix) {
        // I know there is a method .transpose(), but I want (and I feel like i have to) implement it myself 
        int[][] result = new int[matrix[0].length][matrix.length];
        for(int i = 0; i< matrix.length; i++){ //rows
            for(int j = 0; j < matrix[0].length; j++){ //columns
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
// @lc code=end

