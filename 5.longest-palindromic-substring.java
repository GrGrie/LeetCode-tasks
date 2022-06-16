/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        /*
         * Leetcode Daily Challenge 16.06.2022.
         */
        
        // My tests:
        // civic, level, noon, tacocat, aibohphobia, plan, canal, panama, a, bb, cbc, bcc, square 
        
        int n = s.length(), left = 0, right = 0;
        /*
         * I have read about DP solution from GoAheadShaun, haven't came across this very often, so
         * I think I should start practising some of this now. Afaiu this is just a matrix that keeps
         * track whether substring[left][right] is a palilndrome.
         */
        boolean[][] dp = new boolean[n][n];

        for(int length = 0; length < n; length++){
            for(int i = 0; i + length < n; i++){
                //Now 'i' is the left pointer and 'i+length' is the right one
                // If left and right characters are the same, and inner substring is palindrome
                if(s.charAt(i) == s.charAt(i+length) && (length < 2 || dp[i+1][i+length-1]))
                // Then current substring is also a palindrome
                    dp[i][i+length] = true;
                else
                // Otherwise it isn't
                    dp[i][i+length] = false;

                //If current substring is longer then previous maximum, then update maximums
                if(dp[i][i+length] && length > right - left){
                    left = i;
                    right = i + length;
                }
            }
        }
        return s.substring(left, right + 1);
        
    }
}
// @lc code=end

