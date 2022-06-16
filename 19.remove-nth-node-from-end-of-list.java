/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        /*
         * Algorithms Study Plan (L1). Day 5.
         */

        ListNode left = head, right = head;
        //We set offset of the right pointer by n. This is how we show the left one which value to skip
        while(n > 0){
            n--;
            right = right.next;
        }
        //Case when we want to remove first element
        if(right == null) return head.next;

        //Going along with the right and the left one. When the right reaches the end,
        // That means, the next value of the left has to be skipped. After that just return head
        while(right.next != null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;

        return head;
    } 
}
// @lc code=end

