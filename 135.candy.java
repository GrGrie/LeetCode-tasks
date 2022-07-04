import java.util.Arrays;

/*
 * @lc app=leetcode id=135 lang=java
 *
 * [135] Candy
 */

// @lc code=start
class Solution {
    /*
     * Leetcode Daily Challenge 04.07.2022
     */
    public int candy(int[] ratings) {
        int answer = 0;
        int[] candies = new int[ratings.length];

        Arrays.fill(candies, 1);
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i-1])   // If right rating is greater than left, give right more candies
                candies[i] = candies[i-1] + 1;
        }

        for(int i = ratings.length - 1; i > 0; i--){
            if(ratings[i] < ratings[i-1] && candies[i-1] < candies[i] + 1)
                candies[i-1] = candies[i] + 1;
        }

        for(int i : candies) answer += i;

        return answer;
    }
}
// @lc code=end

