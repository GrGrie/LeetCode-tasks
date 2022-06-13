/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        /*
         * Algorithms Study Plan (L1). Day 2
         */

         if(k == 0) return;
         else {
            int tmp1 = nums[0], tmp2 = 0;
            for(int i = 1; i < nums.length; i++){
                tmp2 = nums[i];
                nums[i] = tmp1;
                tmp1 = tmp2;
            }
            nums[0] = tmp1;
            rotate(nums, k-1);
         }
    }
}
// @lc code=end

