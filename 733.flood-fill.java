/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */

// @lc code=start
class Solution {
    /*
     * Algorithms Study Plan (L1). Day 7.
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] != color) dfs(image, sr, sc, image[sr][sc], color);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int oldColor, int newColor){
        if(image[sr][sc] == oldColor){
            image[sr][sc] = newColor;
            if(sr - 1 >= 0) dfs(image, sr - 1, sc, oldColor, newColor);
            if(sr + 1 < image.length) dfs(image, sr + 1, sc, oldColor, newColor);
            if(sc - 1 >= 0) dfs(image, sr, sc - 1, oldColor, newColor);
            if(sc + 1 < image[0].length) dfs(image, sr, sc + 1, oldColor, newColor);
        }
    }
}
// @lc code=end

