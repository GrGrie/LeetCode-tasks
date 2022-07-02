import java.util.Arrays;

/*
 * @lc app=leetcode id=1465 lang=java
 *
 * [1465] Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts
 */

// @lc code=start
class Solution {
    /*
     * Leetcode Daily Challenge 02.07.2022
     */
//5\n4\n[3,1]\n[1]
//1000000000\n1000000000\n[2]\n[2]
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        int maxHorizontal = horizontalCuts[0], maxVertical = verticalCuts[0];
        // Finding max Horizontal gap
        for(int i = 1 ; i < horizontalCuts.length ; i++)
            maxHorizontal = Math.max(horizontalCuts[i]-horizontalCuts[i-1],maxHorizontal);
        maxHorizontal = Math.max(h-horizontalCuts[horizontalCuts.length-1],maxHorizontal);
        
        // Finding max vertical gap
        for(int i = 1; i < verticalCuts.length ; i++)
            maxVertical = Math.max(verticalCuts[i]-verticalCuts[i-1],maxVertical);
        maxVertical = Math.max(w-verticalCuts[verticalCuts.length-1],maxVertical);
        
        // Edge cases
        if(verticalCuts.length == 1)
            maxVertical = Math.max(verticalCuts[0], w-verticalCuts[0]);
        if(horizontalCuts.length == 1)
            maxHorizontal = Math.max(horizontalCuts[0], h-horizontalCuts[0]);
        
        // Some weird test cases?
        long answer = 1l*maxHorizontal*maxVertical;
        return (int) (answer%1000000007);
    }
}
// @lc code=end

