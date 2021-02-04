/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fastPoint = head;
        ListNode slowPoin = head;
        while(fastPoint != null && fastPoint.next != null) {
            fastPoint = fastPoint.next;
            if(slowPoin == fastPoint) { return true; }
            slowPoin = slowPoin.next;
            fastPoint = fastPoint.next;
            if(slowPoin == fastPoint) { return true; }
        }
        return false;
    }
}
