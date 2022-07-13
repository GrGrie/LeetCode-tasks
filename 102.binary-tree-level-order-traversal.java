import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
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
    /* 
     * Leetcode Daily Challenge 13.07.2022
    */

    private List<List<Integer>> answer;
    private Queue<TreeNode> queue;

    public List<List<Integer>> levelOrder(TreeNode root) {
        answer = new ArrayList<List<Integer>>();
        queue = new LinkedList<>();
        
        if(root == null) return new ArrayList<>();
        queue.add(root);
        bfs(root);


        return answer;
    }

    private void bfs(TreeNode root){
        if(root == null) return;
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> layer = new ArrayList<>();
            for(int i = 0; i < n; i++){
                TreeNode currentNode = queue.poll();
                layer.add(currentNode.val);
                if(currentNode.left != null) queue.add(currentNode.left);
                if(currentNode.right != null) queue.add(currentNode.right);
            }
            answer.add(layer);
        }
    }

}
// @lc code=end

