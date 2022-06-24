import java.util.Arrays;

/*
 * @lc app=leetcode id=1354 lang=java
 *
 * [1354] Construct Target Array With Multiple Sums
 */

// @lc code=start
class Solution {
    /*
     * Leetcode Daily Challenge 24.06.2022
     */
    public boolean isPossible(int[] target) {
        // Create array of ones to compare to
        int[] ones = new int[target.length];
        Arrays.fill(ones, 1);

        //Getting rid of edge cases: if length is 1
        if(target.length == 1){
            if(target[0] == 1) return true;
            else return false;
        }

        // Main algo: maxValue % sumOfRest
        int maxIndex = -1, sum = 0;
        while(!Arrays.equals(target, ones)){
            // If we have at least one bad value, then return false
            for(int i = 0; i < target.length; i++)
                if(target[i] <= 0) return false;
            
            sum = 0;
            maxIndex = getMaxIndex(target);
            for(int i = 0; i < target.length; i++){
                if(i != maxIndex){
                    sum += target[i];
                }
            }

            // If we come to a case where target.length = 2 and 
            // one of the numbers are 1, we can reach any number
            // so return true
            if(sum == 1) return true;

            // If the number is not changed after the % operation
            // (it is smaller than sum), return false
            if(target[maxIndex] == target[maxIndex] % sum) return false;

            // Else do everything as planned and continue
            target[maxIndex] %= sum;
        }
        return true;
    }

    private int getMaxIndex(int[] array){
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 0; i < array.length; i++)
            if(array[i] > max){
                max = array[i];
                maxIndex = i;
            }
        return maxIndex;
    }
}
// @lc code=end

