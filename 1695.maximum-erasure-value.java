/*
 * @lc app=leetcode id=1695 lang=java
 *
 * [1695] Maximum Erasure Value
 */

// @lc code=start
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        /*
         * Leetcode Daily Challenge 12.06.2022. I believe the best solution is going to be
         * with two-pointered sliding window. Just like yesterday. I will try to do it myself
         */
        
        int currentSumm = 0;
        int maxSumm = 0;
        for(int pointerLeft = 0, pointerRight = 0; pointerRight < nums.length; pointerRight++){
            // Add right number to the summ
            currentSumm += nums[pointerRight];
            //Condition to skip first number
            if(currentSumm != nums[pointerRight]){
                // In case we find, that number at pointer right is already in the array
                // We will substract everything before duplicate
                int toSubstract = 0;
                // Going from left to right to check if there is duplicate
                for(int i = pointerLeft; i < pointerRight && pointerLeft <= i; i++){
                    // Get ready to substract in case we have to
                    toSubstract += nums[i];
                    //If duplicate is found, then move left pointer and substract
                    if(nums[i] == nums[pointerRight]) {
                        pointerLeft = i+1;
                        currentSumm -= toSubstract;
                    }
                }
            }
            //Get maximum of the summs
            if(maxSumm < currentSumm) maxSumm = currentSumm;
        }
        return maxSumm;
    }
}
//[187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434]
//[5,4,6,3,8,1,10,4,2,6]
//[1,2,3,4,3,2,3,1]
// @lc code=end

