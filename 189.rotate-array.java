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
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
            
    }

    private void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
    
    private void reverse(int[] nums, int pointerLeft, int pointerRight){
        while(pointerLeft < pointerRight)
            swap(nums, pointerLeft++, pointerRight--);
    }
}
// @lc code=end

