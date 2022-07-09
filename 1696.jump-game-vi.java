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
        int answer = nums[0];
        int i = 0;
        while(i != nums.length -1){
            int amountOfPositives = 0, newIndex = 0;
            int currMax = Integer.MIN_VALUE;
            for(int j = i + 1; j <= Math.min(nums.length - 1, i+k); j++){
                if(nums[j] > 0)
                    amountOfPositives++;
                if(nums[j] > currMax){
                    currMax = nums[j];
                    newIndex = j;
                }
            }
            if(amountOfPositives < 2)
                answer += currMax;
            else {
                for(int j = i + 1; j <= Math.min(nums.length - 1, i+k); j++){
                    if(nums[j] > 0){
                        answer += nums[j];
                        newIndex = j;
                        break;
                    }
                }
            }
            i = newIndex;
            System.out.println("i = " + i);
        }

        return answer;
    }
}
// @lc code=end

