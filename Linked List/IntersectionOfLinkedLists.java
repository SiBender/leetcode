//https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1215/
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
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);
        
        if(lenA > lenB) {
            for (int i = 0; i < (lenA - lenB); i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < (lenB - lenA); i++) {
                headB = headB.next;
            }
        }
        
        while(headA != null && headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    
    public int getListLength(ListNode head) {
        int length = 0;
        while(head != null) {
            head = head.next;
            length++;
        }
        return length;
    }
}
