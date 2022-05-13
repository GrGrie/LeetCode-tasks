/*
 * @lc app=leetcode id=116 lang=java
 *
 * [116] Populating Next Right Pointers in Each Node
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        /*
        Actually today's (13.05.2022) PotD is task 117, but I understood that I have to do
        this problem before going to the next one. It took me a long time (and 1 youtube video)
        to understand what actuallly is Node.next. As I understood, that is the pointer we want
        to point to the right node on the same level, while Node.left and Node.right are children
        of root node. Gonna try and do some triversal here. My first time problem solving with Nodes
        */


        // Simple check if I was given an empty tree
        if(root == null)
            return null;

        // Create leftNode to move though it as left as we possibly can
        Node leftNode = root;
        while(leftNode.left != null){
            // If our leftNode have left child, means we can consider it as "parent" node
            Node parent = leftNode;
            // Without this while check I miss the right-most lowest node, cuz of line 57 I guess
            while(parent != null){
                parent.left.next = parent.right;
                if(parent.next != null)
                    parent.right.next = parent.next.left;
                parent = parent.next;
            }
            // Go to the left node one level lower
            leftNode = leftNode.left;
        }
        return root;
    }
}
// @lc code=end

