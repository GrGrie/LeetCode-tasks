/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        /*
         * Algorithms study plan. Day one
         */
        int left = 0, right = nums.length-1, middle = (right-left)/2;
        while(left < right && nums[middle] != target){
            if(target < nums[middle]) right = middle - 1;
            if(target > nums[middle]) left = middle + 1;
            middle = (right + left)/2;
        }
        if(nums[middle] == target) return middle;
        else return -1;
    }
}
//[-1,0,3,5,9,12]\n2
//[5]\n-5
//[2,5]\n5
//[3, 8, 27, 28, 32, 38, 41, 53, 58, 59, 83, 87, 118, 121, 122]\n
// @lc code=end

