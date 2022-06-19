/*
 * @lc app=leetcode id=1268 lang=java
 *
 * [1268] Search Suggestions System
 */

// @lc code=start
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Solution {
    /*
     * Leetcode Daily Challenge 19.06.2022
     */
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> answer = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> tmpAnswer = new ArrayList<>();
        
        //Add all of the words to a list and sort them
        for(int i = 0 ; i < products.length; i++) words.add(products[i]);
        words.sort(Comparator.naturalOrder());

        int left = 0, right = products.length - 1;
        // Search each of the possible prefixes
        for(int i = 1; i <= searchWord.length(); i++){
            String prefix = searchWord.substring(0, i);
            tmpAnswer = new ArrayList<>();
            // Go through words and find the ones that have the same prefix
            while(left <= right && tmpAnswer.size() < 3){ // Also check that length should be less than 3
                if(words.get(left).startsWith(prefix))
                    tmpAnswer.add(words.get(left));
                left++;
            }
            answer.add(tmpAnswer);
            left = 0;
        }
        return answer;
    }
}
// @lc code=end

