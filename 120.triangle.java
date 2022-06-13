/*
 * @lc app=leetcode id=120 lang=java
 *
 * [120] Triangle
 */

// @lc code=start
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        /*
         * Leetcode Daily Challenge 13.06.2022. This seems like a simple DFS solution,
         * but I don't remember how to do one, so I believe this will consume some amount of time.
         * Okay, tbh, I came up with something like bottom-up idea, but didn't know how to implement
         * it right. So I read a solution (which described what I was thinking) and found out, that
         * implementations is pretty simple and straight forward. Thank you "GoAheadShaun" <3
         */

        int size = triangle.size();
        // In this array we want to store all sums from bottom to up.
        int[] sums = new int[size+1];
        for(int level = size - 1; level >=0 ; level--){
            for(int i = 0; i <= level; i++)
                sums[i] = triangle.get(level).get(i) + Math.min(sums[i], sums[i+1]);
        }

        return sums[0];
    }
}
// @lc code=end

