/*
 * @lc app=leetcode id=746 lang=java
 *
 * [746] Min Cost Climbing Stairs
 */

// @lc code=start
class Solution {
    /*
     * Leetcode Daily Challenge 10.07.2022
     */
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 2) return Math.min(cost[0], cost[1]);

        for(int i = 2; i < cost.length;i++){
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        }

        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}
// @lc code=end

