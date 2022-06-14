/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        /*
         * Algorithms Study Plan (L1). Day 3
         */

        int left = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] != 0)
                swap(nums, left++, right);
        }
        for(; left < nums.length; left++) nums[left] = 0;
    }

    private void swap(int[] nums, int left, int right){
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
}
// @lc code=end

