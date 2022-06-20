
/*
 * @lc app=leetcode id=820 lang=java
 *
 * [820] Short Encoding of Words
 */

// @lc code=start
import java.util.HashSet;
class Solution {
    /*
     * Leetcode Daily Challenge 20.06.2022. I am not really sure if I got the problem correct,
     * but I will try the following approach. Just put all of the words from words to HashSet.
     * Then remove ones, that are suffixes of another ones. After that count the answer.
     */
    public int minimumLengthEncoding(String[] words) {
        
        HashSet<String> dictionary = new HashSet<>();
        for(String word : words) dictionary.add(word);

        for(String word : words){
            for(String suffix : words){
                if(word.endsWith(suffix) && !word.equals(suffix))
                    dictionary.remove(suffix);
            }
        }

        int answer = 0;
        for(String word : dictionary) answer += word.length() + 1;
        return answer;
    }
}
// @lc code=end

