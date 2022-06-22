/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
     * Algorithms Study Plan (L1). Day 10.
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        var answer = new ListNode();
        var head = answer;

        while(list1 != null || list2 != null){
            if(list2 == null || (list1 != null && list1.val < list2.val)){
                answer.next = list1;
                list1 = list1.next;
            } else {
                answer.next = list2;
                list2 = list2.next;
            }
            answer = answer.next;
        }
        // In case we try to return answer, we will return only the last number.
        // so we have to return a pointer to an answer.
        // In case we try to return head, it will start from '0', which we don't want to
        // So by returning head.next we simply skip the first number
        return head.next;
        
    }

}
// @lc code=end

