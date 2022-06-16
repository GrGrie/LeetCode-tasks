/*
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
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
    public ListNode middleNode(ListNode head) {
        /*
         * Algorithms Study Plan (L1). Day 5.
         */
        ListNode left = head, right = head;
        while(right != null && right.next != null){
            left = left.next;
            right = right.next.next;
        }
        return left;
        
    }
}
// @lc code=end

