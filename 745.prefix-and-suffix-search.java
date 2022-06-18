/*
 * @lc app=leetcode id=745 lang=java
 *
 * [745] Prefix and Suffix Search
 */

// @lc code=start
import java.util.HashMap;
class WordFilter {
/*
 * Leetcode Daily Challenge 18.06.2022.
*/
    // Creating a dictionary of all possible prefix+suffix words
    private HashMap<String, Integer> dictionary;

    public WordFilter(String[] words) {
        // Initialize dictionary
        dictionary = new HashMap<String, Integer>();
        for(int i = 0; i < words.length; i++){
            // For each of the input words count all possible prefixes
            String word = words[i];
            for(int prefixEnd = 0; prefixEnd < word.length(); prefixEnd++){
                String prefix = word.substring(0, prefixEnd+1);
                // As well as count all possible suffixes
                for(int suffixStart = 0; suffixStart < word.length(); suffixStart++){
                    String suffix = word.substring(suffixStart);
                    // Put this prefix+suffix pair in the dictionary
                    // # is just a separator, could be any not-used sign
                    dictionary.put(prefix+"#"+suffix, i);
                }
            }
        }
        /*
        For "apple" this will look as follows: 
        "a#e", "a#le", "a#ple", "a#pple", "a#apple"
        "ap#e", "ap#le", "ap#ple","ap#pple", "ap#apple"
        "app#e", "app#le", "app#ple", "app#pple", "app#apple"
        ...
        ... 
        */    
    }
    
    public int f(String prefix, String suffix) {
        int answer = -1;
        // Search if we have such combination in our dictionary HashMap
        String inpuString = prefix+"#"+suffix;
        if(dictionary.containsKey(inpuString)) return dictionary.get(inpuString);
        return answer;
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */
// @lc code=end

