/*
 * @lc app=leetcode id=745 lang=java
 *
 * [745] Prefix and Suffix Search
 */

// @lc code=start
class WordFilter {
/*
 * Leetcode Daily Challenge 18.06.2022.
*/

    private String[] words;

    public WordFilter(String[] words) {
        this.words = words;    
    }
    
    public int f(String prefix, String suffix) {
        int maxWord = -1, answer = -1;
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if(word.startsWith(prefix) && word.endsWith(suffix) && word.length() > maxWord){
               answer = i;
               //maxWord = word.length(); 
            }
                

        }
        return answer;
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */
// @lc code=end

