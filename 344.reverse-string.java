/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        /*
         * Algorithms Study Plan (L1). Day 4.
         */
        char tmp;
        for(int left = 0, right = s.length - 1; left < right; left++ , right--){
            tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
        }
    }
}
// @lc code=end

