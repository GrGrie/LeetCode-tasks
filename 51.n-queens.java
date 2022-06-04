/*
 * @lc app=leetcode id=51 lang=java
 *
 * [51] N-Queens
 */

// @lc code=start

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        /* 
        Well, I understand that I have to do it with backtracking, but I have enver done it before
        So I am going to struggle now. 
        I am goin to use 2-d array to represent board, and convert it to 2-d List on the last step only
        */
        
        return null;
    }

    // Function that is supposed to return true, if we can place Queen in position [row][column]
    public boolean isValid(int[][] board, int row, int column){
        int size = board.length;
        boolean isValid = true;
            for(int i = 0; i < size; i++){
                for(int j = 0; j < size; j++){
                    if(board[row][j] == 1) // Check if the queen is attacked horizontally
                        isValid = false;
                    if(board[i][column] == 1) //Check if the queen is attacked vertically
                        isValid = false;
                    if(board[i][j] == 1 && (i+j == row+column || i-j == row-column)) // Check if the queen is attacked diagonally
                        isValid = false;
                }
            }
        return isValid;
    }

    // Function that convert 2-d array to a List of needed Strings
    public List<String> convertToList(int[][] board){
        List<String> result = new LinkedList<String>();
        String tmp_s = "";
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board.length; column++){
                if(board[row][column] == 0)
                    tmp_s = tmp_s.concat(".");
                else
                    tmp_s = tmp_s.concat("Q");
            }
            result.add(tmp_s);
            tmp_s = "";
        }
        return result;
    }
}
// @lc code=end

