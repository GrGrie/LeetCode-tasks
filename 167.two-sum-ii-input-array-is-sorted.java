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

         // Second approach. Now I will use binary search for the second index
        int[] answer = new int[2];
        boolean solutionFound = false;
        int i = 0; // index_1

        while(!solutionFound){
            /* 
             * We know that solution exists and array numbers is sorted. So insted of just
             * going and searching one by one, we can do a binary search for the second item
             * For example [2,7,11,15], taget = 9; We first set i = 0 => numbers[i] = 2 =>
             * lets bs for 9-2 = 7; If we can, we found the solution, if we don't, then just
             * move i to the next one (i++)
            */
            int bs = binarySearch(numbers, target - numbers[i]);
            // First condition checks whether the binary search was successful or not
            if(bs != -9999 && i != bs){
                // If we found values that are equal but have different indexes, my algo gonna skip first
                // So we have to deal with it by swapping the indexes.
                if(i > bs){int tmp = i; i = bs; bs = tmp;}
                answer[0] = i + 1;
                answer[1] = bs + 1;
                solutionFound = true;
            }
            i++;
        }
        return answer;
    }

    // A simple binary search function
    private int binarySearch(int[] numbers, int target){
        int left = 0, right = numbers.length - 1, middle = left + (right-1) / 2;
        
        while(left <= right){
            middle = left + (right-left) / 2; 
            if(numbers[middle] == target) return middle;
            if(numbers[middle] < target) left = middle + 1;
            else right = middle - 1;   
        }
        // Value that cannot be achieved in the task, just to show unsuccessful bs
        return -9999;
    }
}
// @lc code=end

