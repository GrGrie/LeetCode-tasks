/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    /*
     * Leetcode Study Plan (L1). Day 10.
     */
    public ListNode reverseList(ListNode head) {
        
        return newListPointer(null, head);
    }

    ListNode newListPointer(ListNode left, ListNode right){
        if(right == null)
            return left;
        
        ListNode tmp = right.next;
        right.next = left;
        return newListPointer(right, tmp);
    }
}
// @lc code=end

