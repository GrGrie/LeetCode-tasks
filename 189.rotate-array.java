/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        /*
         * Algorithms Study Plan (L1). Day 2
         */
        

        int pointerLeft = 0, pointerRight = nums.length - k;
        while(pointerLeft < nums.length){
            while(pointerRight < nums.length && pointerLeft < nums.length){
                swap(nums, pointerLeft, pointerRight);
                pointerLeft++;
                pointerRight++;
                print(nums);
            }
            System.out.println("pointerLeft = " + pointerLeft + ", pointerRight = " + pointerRight);
            pointerRight = nums.length - k; 
        }
        //[1,2,3,4,5,6,7,8,9,10]\n2

            
    }

    private void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
    private void print(int[] nums){
        for(int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }
}
// @lc code=end

