/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*
         * I understand that there is O(n^2) brute-force solution, but I believe
         * I have to come up with another one. Gonna see what will I figure out
         */

        int[] answer = new int[2];
        boolean isSolved = false;
        int i = 0;

        while(!isSolved && i < numbers.length-1){
            int j = i+1;
            while(j < numbers.length && numbers[j] <= target - numbers[i]){
                //System.out.println("i = " + i + " and j = " + j);
                if(numbers[i] + numbers[j] == target){
                    isSolved = true;
                    answer[0] = i + 1;
                    answer[1] = j + 1;
                    break;
                }
                j++;
            }
            i++;  
        }

        return answer;
    }
}
// @lc code=end

