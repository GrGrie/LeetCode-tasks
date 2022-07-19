import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    /*
     * Leetcode Daily Challenge 19.07.2022
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> row;
        for(int i = 1; i <= numRows; i++){
            row = new ArrayList<>();
            row.add(1); // Set first element to one
            for(int j = 1; j < i; j++){
                if(j != i-1) // If next element is not last, then count it
                    row.add(answer.get(i-2).get(j) + answer.get(i-2).get(j-1));
                else // Else set it to one
                    row.add(1);
            }
            // Add row to the answer
            answer.add(row);
        }

        return answer;
    }
}
// @lc code=end

