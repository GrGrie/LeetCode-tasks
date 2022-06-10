/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
         * Leetcode Daily Challenge 10.06.2022
         * I came up with two pointer approach, hope it works out well.
         */
        int result = 0;
        int pointer = 0;
        Queue<Character> subs = new LinkedList<Character>();

        while(pointer != s.length()){
            char charPointer = s.charAt(pointer);
            if(!subs.contains(charPointer)){
                pointer++;
                subs.add(charPointer);
            } else {
                subs.remove();
                //pointer1++;                
            }
            if(subs.size() > result)
                    result = subs.size();
        }
        return result;
    }
}
// @lc code=end

