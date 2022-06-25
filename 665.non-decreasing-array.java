/*
 * @lc app=leetcode id=665 lang=java
 *
 * [665] Non-decreasing Array
 */

// @lc code=start
class Solution {
    /*
     * Leetcode Daily Challenge 25.06.2022.
     */
    public boolean checkPossibility(int[] nums) {
        if(nums.length == 1 || nums.length == 2) return true;
        boolean onceDone = false;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] > nums[i]){
                if(onceDone) return false;
                if(i < 2 || nums[i-2] <= nums[i]) nums[i-1] = nums[i];
                else nums[i] = nums[i-1];
                onceDone = true;
            }
        }
        return true;
    }
}
// @lc code=end

