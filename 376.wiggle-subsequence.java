/*
 * @lc app=leetcode id=376 lang=java
 *
 * [376] Wiggle Subsequence
 */

// @lc code=start
class Solution {
    /*
     * Leetcode Daily Challenge 03.07.2022
     */
    public int wiggleMaxLength(int[] nums) {
        int wiggleCount = 0;

        // Edge cases
        if(nums.length == 1) return 1;
        else if(nums.length == 2 && nums[0] != nums[1]) return 2;
        else if(nums.length == 2 && nums[0] == nums[1]) return 1;

        int prevDiff = nums[1] - nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i-1] != 0){
                int diff = nums[i] - nums[i-1];
                if(isWiggled(diff, prevDiff) || wiggleCount == 0)
                    wiggleCount++;
                prevDiff = diff;                
            }
        }

        return wiggleCount + 1;
    }

    private boolean isWiggled(int a, int b){
        if(a > 0 && b < 0) return true;
        else if (a < 0 && b > 0) return true;
        else return false;
    }
}
// @lc code=end

