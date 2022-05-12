/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

// @lc code=start
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        /*
        After ~15 mins of figuring out how to solve this problem haven't came up
        with the good idea of how to do it. Watched a YouTube video by NeetCode (not the code itself),
        after that whatched a video about HashMap cuz I have a pretty weak understanding
        of Collection at this point. Now going to try ad do stuff
        */
        
        // I will add all the numbers of nums[] here:
        HashMap<Integer, Integer> numbersToPermutate = new HashMap<>();
        // Outputted sublist:
        List<Integer> subList = new ArrayList<>();
        // Answer:
        List<List<Integer>> answer = new ArrayList<>();

        // Let's add nums to HashMap:
        for(int i : nums){
            // If the number is new, add it to HashMap, otherwise increase value (amount of repetetives) by 1
            if(!numbersToPermutate.containsKey(nums[i]))
                numbersToPermutate.put(nums[i], 1);
            else
                numbersToPermutate.replace(nums[i], numbersToPermutate.get(nums[i]) + 1);
        }

        


        return answer;
    }
}
// @lc code=end

