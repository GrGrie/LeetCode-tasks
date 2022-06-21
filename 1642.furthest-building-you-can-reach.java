
/*
 * @lc app=leetcode id=1642 lang=java
 *
 * [1642] Furthest Building You Can Reach
 */

// @lc code=start
import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    /*
     * Leetcode Daily Challenge 21.06.2022
     */
//[13,9,3,10,11,4,12,1]\n7\n5
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i=0; i<heights.length-1; i++) {
            if (heights[i] >= heights[i+1]) continue;
            bricks -= heights[i+1] - heights[i];
            pq.add(heights[i+1] - heights[i]);

            if (bricks < 0) {
                bricks += pq.poll();
                if (ladders > 0) ladders--;
                else return i;
            }
        }

        return heights.length - 1;
    }
}
// @lc code=end

