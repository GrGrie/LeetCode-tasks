/*
 * @lc app=leetcode id=1332 lang=java
 *
 * [1332] Remove Palindromic Subsequences
 */

// @lc code=start
class Solution {
    public int removePalindromeSub(String s) {
        
        /*  Well, I feel like I am stupid, cuz I understood, that
            subsequence != substring, so we can just remove all 'a's
            and then remove all 'b's. Feels weird
        */
        if(isPalindrome(s)) return 1;
        else return 2;

    }

    // Function checks whether the string is a palindrome or not
    private boolean isPalindrome(String s){
        boolean isPalindrome = true;
        for(int i = 0; i < s.length()/2 + 1; i++)
            if(s.charAt(i) != s.charAt(s.length()-i-1)) 
                isPalindrome = false;
        return isPalindrome;
    }

}
// @lc code=end

