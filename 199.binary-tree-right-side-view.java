/*
 * @lc app=leetcode id=199 lang=java
 *
 * [199] Binary Tree Right Side View
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
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    /*
     * Leetcode Daily Challenge 11.07.2022
     */
    private List<Integer> answer;
    private Stack<TreeNode> stack;
    private ArrayList<TreeNode> level;

    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        
        answer = new ArrayList<>();
        stack = new Stack<>();
        level = new ArrayList<>();
        
        stack.push(root);
        answer.add(root.val);
        bfs();
        return answer;
    }

    private void bfs(){
        while(!stack.isEmpty()){
            // Remove top element from the stack
            TreeNode currentNode = stack.pop();
            // And add its children to the level
            if(currentNode.left != null) level.add(currentNode.left);
            if(currentNode.right != null) level.add(currentNode.right);

            // If we have covered the whole layer and it contains at least one node
            // Then add right-most node (last in the level array) to the answer
            if(stack.isEmpty() && !level.isEmpty()){
                answer.add(level.get(level.size()-1).val);
                // Then add all nodes to the stack and remove them from the layer
                while(!level.isEmpty()){
                    int i = level.size()-1;
                    stack.push(level.get(i));
                    level.remove(i--);
                }
            }
            
        }
    }
}
// @lc code=end

