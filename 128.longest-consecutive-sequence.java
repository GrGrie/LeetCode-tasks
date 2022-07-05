import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    /*
     * Leetcode Daily Challenge 05.07.2022
     */
    public int longestConsecutive(int[] nums) {
        int answer = 0;
        // Task asks us to do it in O(n) time.

        Set<Integer> numSet = new HashSet<>();
        for(int num : nums) numSet.add(num);

        for(int i = 0; i < nums.length; i++){
            int count = 1;

            //From each number go to the left
            int num = nums[i];
            while(numSet.contains(num - 1)){
                count++;
                numSet.remove(num);
                num--;
            }

            //From each number go to the right
            num = nums[i];
            while(numSet.contains(num + 1)){
                count++;
                numSet.remove(num);
                num++;
            }

            answer = Math.max(answer, count);
        }


        return answer;
    }
}
// @lc code=end

