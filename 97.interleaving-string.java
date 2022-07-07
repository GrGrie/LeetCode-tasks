/*
 * @lc app=leetcode id=97 lang=java
 *
 * [97] Interleaving String
 */

// @lc code=start
class Solution {
    /*
     * Leetcode Daily Challenge 07.07.2022
     */

    // Create them here to avoid providing them as parameters to dfs() method
    private boolean[][] invalid;
    private char[] s1Char;
    private char[] s2Char;
    private char[] s3Char;

    public boolean isInterleave(String s1, String s2, String s3) {
        // Edge case
        if(s1.length() + s2.length() != s3.length()) return false;
        
        s1Char = s1.toCharArray();
        s2Char = s2.toCharArray();
        s3Char = s3.toCharArray();
        int n = s1.length(), m = s2.length();
        invalid = new boolean[n+1][m+1];
        return dfs(0,0,0);
    }

    private boolean dfs(int i, int j, int k){
        if(invalid[i][j]) return false;
        if(k == s3Char.length) return true;
        boolean valid = 
        i < s1Char.length && s1Char[i] == s3Char[k] && dfs(i+1, j, k+1) ||
        j < s2Char.length && s2Char[j] == s3Char[k] && dfs(i, j+1, k+1);
        if(!valid) invalid[i][j] = true;
        return valid;
    }
}
// @lc code=end

