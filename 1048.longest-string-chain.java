/*
 * @lc app=leetcode id=1048 lang=java
 *
 * [1048] Longest String Chain
 */

// @lc code=start
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
class Solution {

    private Set<String> wordDict;
    private Map<String, Integer> memo;

    public int longestStrChain(String[] words) {
        /*
         * Leetcode Daily Challenge 15.06.2022. I undertoon quickly that I can sort
         * them by their length, and then go from the longest words to the shortes and
         * not adding letters, but deleting them instead. Then use DFS to find max.After 
         * thinking of implementation of such a method I look at the discussion, to get 
         * the idea of using HashMap for this. Now I am trying to do it.
         */
        wordDict = new HashSet<>();
        Collections.addAll(wordDict, words); // adding all words to a set for constant look-up

        int maxPath = 1;
        memo = new HashMap<>();
        for (String word: words) 
            maxPath = Math.max(maxPath, dfs(word));

        return maxPath;
    }

    private int dfs(String word) {
        if (memo.containsKey(word)) return memo.get(word); // If we've computed this word before, return the result.

        StringBuilder sb = new StringBuilder(word); // StringBuilder is used to easily add and remove letters
        int maxPath = 0;
        // Delete each character in the word, check if that's a valid word in the set, add the character back and continue
        for (int i=0; i<word.length(); i++) {
            sb.deleteCharAt(i);
            String prevWord = sb.toString();
            if (wordDict.contains(prevWord)) 
                maxPath = Math.max(maxPath, dfs(prevWord));
            sb.insert(i, word.charAt(i));
        }
        
        memo.put(word, maxPath + 1); // store the result
        return memo.get(word);
    }
}
// @lc code=end

