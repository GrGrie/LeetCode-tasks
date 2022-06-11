/*
 * @lc app=leetcode id=1658 lang=java
 *
 * [1658] Minimum Operations to Reduce X to Zero
 */

// @lc code=start
import java.util.LinkedList;
class Solution {

    private static int answer = 0;

    public int minOperations(int[] nums, int x) {
        /*
         * Leetcode Daily Challenge 11.06.2022. I can see a backtracking solution,
         * but now  I am trying to figure out another one, which would go faster.
         */
        LinkedList<Integer> numsList = new LinkedList<>();
        arrToList(nums, numsList);
        answer = 0;
        solve(numsList, x);
        if(answer == 0) answer--;
        return answer;
    }
//[1,1,4,2,3]\n5
//[5,6,7,8,9]\n4
//[3,2,20,1,1,3]\n10
//[1,1,1,1,1,1,1,1,11,2]\n10
//[1,1]\n3
    private void solve(LinkedList<Integer> numList, int target){
        if(target == 0 || (numList.size() == 0 && target != 0)) return;
            int first = numList.getFirst();
            int last = numList.getLast();
            int max = Math.max(first, last);
            if((max == first && target >= first) || (max == last && target < last && target >= first)){
                target -= first;
                numList.removeFirst();
                answer++;
                solve(numList, target);
            } else if((max == last && target >= last) || (max == first && target < first && target >= last)){
                target -= last;
                numList.removeLast();
                answer++;
                solve(numList, target); 
            } else return;
    }

    private void arrToList(int[] nums, LinkedList<Integer> list){
        for(int i = 0; i < nums.length; i++)
            list.add(nums[i]);
    }
}
// @lc code=end

