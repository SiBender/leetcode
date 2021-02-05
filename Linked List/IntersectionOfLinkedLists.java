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
            headA = offset(headA, lenA - lenB);
        } else {
            headB = offset(headB, lenB - lenA);
        }
        
        while(headA != null && headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    
    private int getListLength(ListNode head) {
        int length = 0;
        while(head != null) {
            head = head.next;
            length++;
        }
        return length;
    }
    
    private ListNode offset(ListNode head, int count) {
        for (int i = 0; i < count; i++) {
                head = head.next;
        }
        return head;
    }
}
