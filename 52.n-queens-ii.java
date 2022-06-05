/*
 * @lc app=leetcode id=52 lang=java
 *
 * [52] N-Queens II
 */

// @lc code=start
class Solution {

    public static int count = 0;

    public int totalNQueens(int n) {
        /* 
         * I can see this is the exact same task as previous one, but I have to output number
         *  of variants, not all of the solutions. However I am not going to Ctrl+C Ctrl+V
         * yesterday's task but do it one more time to get more practice.
        */
        // I will represent the board as 2-D array of 0's and 1's, where 1 is valid Queen placement
        int[][] board = new int[n][n];
        count = 0; // Send 4 wrong answers, beacuse it turns out Leetcode runs multiple runs on the same program, not one by one
        solve(board, 0);
        return count;
    }

    // Main solving method
    public void solve(int[][] board, int startColumn){
        // Exit condition of backtracking
        if(startColumn == board.length){
            count++;
            //printBoard(board);
            return;
        }
        
        // This is backtracking algorithm
        for(int i = 0; i < board.length; i++){
            if(isValid(board, i, startColumn)){
                board[i][startColumn] = 1;
                solve(board, startColumn + 1);
                board[i][startColumn] = 0;
            }
        }
    }

    // This will help me to print the board a number of times
    public void printBoard(int[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Methods check if the queen placed in (row, column) would be attacked by others.
    public boolean isValid(int board[][], int row, int column){
        boolean isValid = true;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                // Check horizontals:
                if(board[row][j] == 1 && isValid) 
                    isValid = false;
                // Check diagonals:
                if((board[i][j] == 1 && (i + j == row + column || i - j == row - column)) && isValid)
                    isValid = false;
            }
        }
        return isValid;
    }
}
// @lc code=end

