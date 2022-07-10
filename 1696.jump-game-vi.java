/*
 * @lc app=leetcode id=1696 lang=java
 *
 * [1696] Jump Game VI
 */

// @lc code=start
class Solution {
    /*
     * Leetcode Daily Challenge 09.07.2022
     */
    //[10,-5,-2,4,0,3]\n3
    //[0,-1,-2,-3,1]\n2
    public int maxResult(int[] nums, int k) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int sum = 0;
        for(int num : nums) sum += num;

        int minSum = nums[1];
        for(int i = 1; i != nums.length - 2;){
            int minimum = Integer.MAX_VALUE;
            int minimumIndex = 0;
            for(int j = i+1; j <= Math.min(i+k, nums.length - 2); j++){
                minimum = Math.min(nums[j], minimum);
                minimumIndex = j;
            }
            
            i = minimumIndex;
            minSum += nums[i];
        }

        return sum - minSum;
    }
}
// @lc code=end

