/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        /*
         * Algorithms Study Plan (L1). Day 4
         */
        String[] words = s.split(" ");
        String answer = "";
        for(int i = 0; i < words.length; i++){
            words[i] = reverseWord(words[i]);
            answer = answer.concat(words[i]);
            if(i != words.length - 1) answer = answer.concat(" ");
        }
        return answer;
    }
    

    private String reverseWord(String s){
        char[] word = s.toCharArray();
        char tmp;
        for(int left = 0, right = word.length - 1; left < right; left++, right--){
            tmp = word[left];
            word[left] = word[right];
            word[right] = tmp;
        }
        return String.copyValueOf(word);
    }
}
// @lc code=end

