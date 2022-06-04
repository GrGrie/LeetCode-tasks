/*
 * @lc app=leetcode id=51 lang=java
 *
 * [51] N-Queens
 */

// @lc code=start

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        /* 
        Well, I understand that I have to do it with backtracking, but I have enver done it before
        So I am going to struggle now. 
        I am goin to use 2-d array to represent board, and convert it to 2-d List on the last step only
        */
        
        int[][] board = new int[n][n];
        for(int i = 0; i < n; i++) solve(board, i);
        
        return null;
    }

    

    public void solve(int[][] board, int startColumn){
        int n = board.length;
        if(startColumn == n){
            printBoard(board);
            return;
        }
        for(int row = 0; row < n; row++){
                if(isValid(board, row, startColumn)){
                    if(board[row][startColumn] == 0){
                        board[row][startColumn] = 1;
                        solve(board, startColumn + 1);
                    }
                }
        }
    }
    
    // Function to print the board :)
    public void printBoard(int[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function that is supposed to return true, if we can place Queen in position [row][column]
    public boolean isValid(int[][] board, int row, int column){
        boolean isValid = true;
            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board.length; j++){
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

