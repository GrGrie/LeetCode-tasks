/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lengthA = 1, lengthB = 1;
        ListNode tmpA = headA;
        ListNode tmpB = headB;
        boolean areEqual = false;

        /* Now I understand that I probably can solve it without counting lengths, but
        I don't think that creating 2 int variables would impact that much on overall
        memory usage of the big project. Thus I believe my solution is fine*/
        while(!(tmpA.next == null)) {lengthA++; tmpA = tmpA.next;} // Counting length of the list A
        while(!(tmpB.next == null)) {lengthB++; tmpB = tmpB.next;} // Counting length of the list B

        if(lengthA >= lengthB){
            for(int i = 0; i < lengthA; i++){
                // If we point at the same node, then we have found the soultion, so return it 
                if(headA == headB) 
                    return headA;
                // If we don't then at some point I want to go though both lists simultaneously 
                if(lengthA - lengthB == i) areEqual = true; // Here we can count a start point to go
                if(areEqual) headB = headB.next; // Now we are going though the second list as well
                headA = headA.next; // Just continue going though the first list
                
            }
        } else { //Everything the same, but vice-versa
            for(int i = 0; i < lengthB; i++){
                if(headA == headB) 
                    return headA;
                if(lengthB - lengthA == i) areEqual = true;
                if(areEqual) headA = headA.next;
                headB = headB.next;
                
            }
        }
        return null;
    }
}
// @lc code=end

