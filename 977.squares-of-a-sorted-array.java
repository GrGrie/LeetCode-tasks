import java.security.cert.PolicyNode;

/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        /*
         * Algorithms Study plan (L1). Day 2
         */
        int[] answer = new int[nums.length];
        int i = 0;
        int pointerLeft = 0, pointerRight = nums.length-1;
        while(pointerLeft<=pointerRight){
            if(Math.abs(nums[pointerLeft]) > Math.abs(nums[pointerRight]))
                answer[nums.length - 1 - (i++)] = (int) Math.pow(nums[pointerLeft++],2);
            else
                answer[nums.length - 1 - (i++)] = (int) Math.pow(nums[pointerRight--],2);

        }
        return answer;
    }
        
}
// @lc code=end

