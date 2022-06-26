/*
 * @lc app=leetcode id=1423 lang=java
 *
 * [1423] Maximum Points You Can Obtain from Cards
 */

// @lc code=start
class Solution {
    /*
     * Leetcode Daily Challenge 26.06.2022. I can see this as an easy 
     * window solution. Just finding maximum sum out of the window sized (n-k)
     */
// [96,90,41,82,39,74,64,50,30]\n8
// [100,40,17,9,73,75]\n3
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0, n = cardPoints.length;

        int left = 0, right = n - k;

        if(k < n / 2){
            for(int i = 0; right <= n; right++, left++){
                if(sum < findArrSum(cardPoints, i, left) + findArrSum(cardPoints, right, n))
                    sum = findArrSum(cardPoints, i, left) + findArrSum(cardPoints, right, n);
            }
            return sum;  
        } else {
            sum = Integer.MAX_VALUE;
            while(right <= n){
                if(sum > findArrSum(cardPoints, left, right))
                    sum = findArrSum(cardPoints, left, right);
                right++;
                left++;
            }
            return findArrSum(cardPoints, 0, n) - sum;
        }
        
    }

    private int findArrSum(int[] array, int left, int right){
        int sum = 0;
        for(; left < right; left++)
            sum += array[left];
        return sum;
    }
}
// @lc code=end

