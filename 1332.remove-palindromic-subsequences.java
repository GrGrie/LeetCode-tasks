/*
 * @lc app=leetcode id=1332 lang=java
 *
 * [1332] Remove Palindromic Subsequences
 */

// @lc code=start
class Solution {
    public int removePalindromeSub(String s) {
    
        int result = 0, i = 0;
        String tmpString;
        while(!s.equals("")){
            tmpString = s.substring(i, s.length());
            //System.out.println("tmpString before = " + tmpString);
            if(isPalindrome(tmpString)){
                //System.out.println("IF HAPPENS! i = " + i);
                s = s.substring(0, i) + s.substring(i+tmpString.length(), s.length());
                result++;
                i = 0;
                
            } else {
                tmpString = s.substring(i, s.length()-1);
                if(isPalindrome(tmpString)){
                    s = s.substring(0, i) + s.substring(tmpString.length(), s.length());
                    result++;
                    i = 0;
                    //System.out.println("ELSE HAPPENS!");
                } else {
                    i++;
                }
            }
            System.out.println("tmpString after = " + tmpString + " and s = " + s);
        }
        return result;

    }

    // Function checks whether the string is a palindrome or not
    private boolean isPalindrome(String s){
        boolean isPalindrome = true;
        for(int i = 0; i < s.length()/2 + 1; i++)
            if(s.charAt(i) != s.charAt(s.length()-i-1)) 
                isPalindrome = false;
        //System.out.println("isPalindrome: " + isPalindrome);
        return isPalindrome;
    }

}
// @lc code=end

