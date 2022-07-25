/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    /*
     * Leetcode Daily Challenge 25.07.2022.
     */
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0 || (nums.length == 1 && target != nums[0])) return new int[]{-1,-1};
        int[] answer = new int[]{-1,-1};

        if(nums[bs(nums, target)] != target) return answer;
        answer[0] = bs(nums, target);
        answer[1] = answer[0];
        System.out.println(answer[0]);
        while((answer[0] > 0 && nums[answer[0]] == target)){
            if(nums[answer[0]] == target) answer[0]--;
        }
        while((answer[1] < nums.length-1 && nums[answer[1]] == target)){
            if(nums[answer[1]] == target) answer[1]++;
        }
        return answer;
    }

    private int bs(int[] nums, int target){
        int n = nums.length;
        int left = 0, right = n - 1, mid = (right + left)/2;
        while(left <= right && right < n && mid < n){
            if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
            mid = (right + left)/2;
        }
        return mid;
    }
}
// @lc code=end

