/*
 * @lc app=leetcode id=1658 lang=java
 *
 * [1658] Minimum Operations to Reduce X to Zero
 */

// @lc code=start
import java.util.LinkedList;
class Solution {
    //[1,1,4,2,3]\n5
    //[5,6,7,8,9]\n4
    //[3,2,20,1,1,3]\n10
    //[1,1,1,1,1,1,1,1,11,2]\n10
    //[1,1]\n3
    //[5,2,3,1,1]\n5
    public int minOperations(int[] nums, int x) {
        /*
         * Leetcode Daily Challenge 11.06.2022. I can see a backtracking solution,
         * but now  I am trying to figure out another one, which would go faster.
         * I haven't come up with the idea of solution myself, so I have read an article by
         * "u/GoAheadShaun". I have read only the idea, so now I will try to code it 
         */
        int answer = -1;
        int pointerLeft = 0;
        int target = sumOfArray(nums) - x;
        int currentSumm = 0;
        for(int pointerRight = 0; pointerRight < nums.length; pointerRight++){
            currentSumm += nums[pointerRight];
            while(currentSumm > target && pointerLeft <= pointerRight){
                currentSumm -= nums[pointerLeft];
                pointerLeft++;
            }
            if(currentSumm == target) answer = Math.max(answer, pointerRight - pointerLeft + 1);
        }
        if(answer == -1) return answer;
        else return nums.length - answer;
    }

    private int sumOfArray(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length;i++)
            sum += nums[i];
        return sum;
    }
}
// @lc code=end

