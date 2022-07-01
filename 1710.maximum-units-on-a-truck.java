import java.util.Arrays;
import java.util.Comparator;

/*
 * @lc app=leetcode id=1710 lang=java
 *
 * [1710] Maximum Units on a Truck
 */

// @lc code=start
class Solution {
    /*
     * Leetcode Daily Challenge 01.07.2022
     */
    //[[5,10],[2,5],[4,7],[3,9]]\n10
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        // Sorting input from Larget to Lowest boxTypes[i][1]
        // So max items boxes comes first
        Arrays.sort(boxTypes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                    return o2[1] - o1[1];
            }
        });

        // Then simply calculating the answer
        int answer = 0;
        int index = 0;
        while(truckSize > 0){
            if(index == boxTypes.length)
                return answer;
            if(boxTypes[index][0] <= truckSize){
                answer += boxTypes[index][0] * boxTypes[index][1];
                truckSize -= boxTypes[index][0];
                index++;
            } else {
                answer += truckSize * boxTypes[index][1];
                truckSize = 0;
            }
        }

        return answer;
    }
}
// @lc code=end

