/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        /*
         * Algorithms study plan. Day one.
         */
        int left = 0, right = nums.length - 1, current = left + (right-left)/2;
        while(left <= right){
            current = left+(right-left)/2;
            if(nums[current] == target) return current;
            else if(nums[current] > target) right = current - 1;
            else if(nums[current] < target) left = current + 1;
        }
        if(nums[current] < target) return current + 1;
        else return current;
        
    }
}

// @lc code=end

