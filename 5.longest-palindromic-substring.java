/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        /*
         * Leetcode Daily Challenge 16.06.2022.
         */
        
        // My tests:
        // civic, level, noon, tacocat, aibohphobia, plan, canal, panama, a, bb, cbc, bcc, square 
        String answer = "";
        if(s.length() == 1) return s;
        int left = 0, right = 0;
        //Checking odd substrings
        for(int i = 0; i <= s.length()-1; i++){
            //Start from the middle of the possible substring and go both left and right
            left = i; right = i+1;
            //If it is a polindome -> nice, try to find longer one, based on this
            while(left >= 0 && right <= s.length() && isPalindrome(s.substring(left, right))){
                //If our new String is longer than previous answer, update
                if(answer.length() < s.substring(left, right).length())
                    answer = s.substring(left, right);
                //Move to find another polindrome
                left --;
                right++;
            }   
        }

        //Checking even substrings
        for(int i = 0; i <= s.length()-2; i++){
            left = i; right = i+2;
            while(left >= 0 && right <= s.length() && isPalindrome(s.substring(left, right))){
                if(answer.length() < s.substring(left, right).length())
                    answer = s.substring(left, right);
                //Move to find another polindrome
                left --;
                right++;
            }
        }

        return answer;
    }

    private boolean isPalindrome(String s){
        boolean isPalindrome = true;
        for(int i = 0; i < s.length()/2; i++)
            if(s.charAt(i) != s.charAt(s.length() - i - 1))
                isPalindrome = false;
        
        return isPalindrome;
    }
}
// @lc code=end

