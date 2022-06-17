/*
 * @lc app=leetcode id=968 lang=java
 *
 * [968] Binary Tree Cameras
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int numberOfCameras = 0;
    
    public int minCameraCover(TreeNode root) {
        /*
         * Leetcode Daily Challenge. 17.06.2022. I understand, that this should be solved
         * using DFS, but I had actually no idea how to implement it. Now I have seen a 
         * solution by GoAheadShaun and will try to recreate it after just 1 time reading and understanding
         */

        
        /* 
         * -1 will represent that node IS NOT observed and DOES NOT have a camera
         * 0 will represent that node IS observed but DOES NOT have a camera
         * 1 will represent that node IS observed as it DOES have a camera
        */
        if(dfs(root) == -1)
            return numberOfCameras + 1;
        else
            return numberOfCameras;
    }

    private int dfs(TreeNode root){
        if(root == null) return 0;

        int left = dfs(root.left);
        int right = dfs(root.right);

        // If either of children is not obsreved => place a camera in the parent node
        if(left == -1 || right == -1){
            numberOfCameras++;
            return 1;
        // Else if one of children has a camera => parent is observed    
        } else if(left == 1 || right == 1){ 
            return 0;
        }

        // Else it is not observed
        return -1;    
    }
}
// @lc code=end

