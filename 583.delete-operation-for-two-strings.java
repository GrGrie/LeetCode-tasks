/*
 * @lc app=leetcode id=583 lang=java
 *
 * [583] Delete Operation for Two Strings
 */

// @lc code=start

class Solution {
    public int minDistance(String word1, String word2) {
        /*
         * Leetcode Daily Challenge 14.06.2022. I think the solution is as follows:
         * I have to find the longest substring, that contain both word1 and word2,
         * then return word1.length-subtring.length + word2.length-substring.lengthю
         * After around whole day of trying different things I went to solution, to 
         * find, that O(n^2) is the first thing I should have tried and there is a 
         * way to make it better (memorisation) :(
         */
        int[][] memo = new int[word1.length() + 1][word2.length() + 1];
        return word1.length() + word2.length() - 2 * longestCommonSubsequence(word1, word2, word1.length(), word2.length(), memo);        
    }

    private int longestCommonSubsequence(String word1, String word2, int w1Length, int w2Length, int[][] memo){
        if (w1Length == 0 || w2Length == 0)
            return 0;
        if(memo[w1Length][w2Length] > 0)
            return memo[w1Length][w2Length];
        if (word1.charAt(w1Length - 1) == word2.charAt(w2Length - 1))
            memo[w1Length][w2Length] = 1 + longestCommonSubsequence(word1, word2, w1Length - 1, w2Length - 1, memo);
        else
            memo[w1Length][w2Length] = Math.max(longestCommonSubsequence(word1, word2, w1Length, w2Length - 1, memo), longestCommonSubsequence(word1, word2, w1Length - 1, w2Length, memo));
        return memo[w1Length][w2Length];    
    }
}
// @lc code=end

