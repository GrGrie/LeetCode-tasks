/*
 * @lc app=leetcode id=567 lang=java
 *
 * [567] Permutation in String
 */

// @lc code=start
import java.util.HashMap;
class Solution {
    /*
     * Algorithms Study Plan (L1). Day 6.
     */
    public boolean checkInclusion(String s1, String s2) {
        boolean answer = false;
        int s2Len = s2.length(), s1Len = s1.length();
        HashMap<Character, Integer> s1Map = new HashMap<>();
        HashMap<Character, Integer> s2Map = new HashMap<>();
        
        if(s2Len == 0 || s2Len < s1Len) return false;
        // Count amount of letters in s1 and put letter:amount in the map
        for(int i = 0; i < s1Len; i++) {
            s1Map.putIfAbsent(s1.charAt(i), 0);
            s1Map.put(s1.charAt(i), s1Map.get(s1.charAt(i)) + 1);
        }
        // Starting from left to right create a windows of length s1Len
        for(int i = 0; i <= s2Len - s1Len; i++){
            if(s1Map.containsKey(s2.charAt(i))){
            String subString = s2.substring(i, i + s1Len);
            // And then create a similar map but for the substring
            for(int j = 0; j < s1Len; j++){
                s2Map.putIfAbsent(subString.charAt(j), 0);
                s2Map.put(subString.charAt(j), s2Map.get(subString.charAt(j)) + 1);
            }
            // If they are equal, then we already can return true
            if(s1Map.equals(s2Map)) return true;
            s2Map.clear();
            }
            
        }

        return answer;
    }
}
// @lc code=end

