import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode id=315 lang=java
 *
 * [315] Count of Smaller Numbers After Self
 */

// @lc code=start
class Solution {
    /*
     * Leetcode Daily Challenge 23.07.2022
     */
//[5,12,6,8,4,14,3] = [2,4,2,2,1,1,0]
//[2,9,3,5,1,11,0]
    public List<Integer> countSmaller(int[] nums) {
        int len = nums.length;
        List<Integer> ans = new ArrayList<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        
        for(int num: nums) arr.add(num);
        
        Collections.sort(arr);
          
        for(int i = 0; i<len; i++){
            int index = binarySearch(arr,nums[i]);
            ans.add(index);
            arr.remove(index);
        }
        
        return ans;
    }
    
    public int binarySearch(ArrayList<Integer> arr, int target){
        int start = 0;
        int end = arr.size()-1;
        int mid=0;
        
        while(start<=end){
            mid = start + ((end - start)/2);
            int val = arr.get(mid);
            if(val<target) start = mid + 1;
            else end = mid - 1;
        }
        if(arr.get(start) == target) return start;
        return mid;
    }
}
// @lc code=end

