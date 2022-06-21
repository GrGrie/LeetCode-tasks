
/*
 * @lc app=leetcode id=1642 lang=java
 *
 * [1642] Furthest Building You Can Reach
 */

// @lc code=start
import java.util.ArrayList;
class Solution {
    /*
     * Leetcode Daily Challenge 21.06.2022
     */
//[13,9,3,10,11,4,12,1]\n7\n5
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int furthestBuilding = 0;
        int maxBricksSpent = 0;
        ArrayList<Integer> bricksSpent = new ArrayList<>();
        while(ladders >= 0 && furthestBuilding < heights.length){
            while(bricks > 0 && furthestBuilding < heights.length-1){
                System.out.println("Ladders = " + ladders + ", bricks = " + bricks);
                if(heights[furthestBuilding] >= heights[furthestBuilding+1]){
                    furthestBuilding++;
                } else {
                    bricks -= heights[furthestBuilding + 1] - heights[furthestBuilding];
                    bricksSpent.add(heights[furthestBuilding + 1] - heights[furthestBuilding]);
                    if(heights[furthestBuilding + 1] - heights[furthestBuilding] > maxBricksSpent)
                        maxBricksSpent = heights[furthestBuilding + 1] - heights[furthestBuilding];
                    furthestBuilding++;
                }
            }
            if(ladders == 0) break;
            if(maxBricksSpent != 0){
                bricksSpent.remove(bricksSpent.indexOf(maxBricksSpent));
                ladders--;
            }
            bricks += maxBricksSpent;
        }
        
        if(bricks < 0) furthestBuilding--;
        return furthestBuilding;
    }
}
// @lc code=end

