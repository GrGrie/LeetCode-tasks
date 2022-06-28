

/*
 * @lc app=leetcode id=1647 lang=java
 *
 * [1647] Minimum Deletions to Make Character Frequencies Unique
 */

// @lc code=start
import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    /*
     * Leetcode Daily Challenge 28.06.2022
     */
    public int minDeletions(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int answer = 0;

        // Filling the HashMap
        for(int i = 0; i < s.length(); i++){
            map.putIfAbsent(s.charAt(i), 0);
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }

        // tmp array to store amount of letters and keep track of them
        ArrayList<Integer> result = new ArrayList<>();
        //For each value of the map we have the check
        for(int value : map.values()){
            //If the value hasn't been added to result array (which indicate)
            // that this is the first time we see this number), then just add
            if(!result.contains(value))
                result.add(value);
            // If we have already seen this number (like aaabbb, both letters)
            // encounters 3 times, so one of them will go to 'else' section
            else {
                //Then we decrease amount of this letter and add 1 to our answer
                // until we find empty 'slot' for amount of letters
                while(value > 0){
                    value--;
                    answer++;
                    // When empty slot is found, put number there
                    if(!result.contains(value)) {
                        result.add(value);
                        break;
                    }
                } 
                
            }
        }
        return answer;
    }
}
// @lc code=end

