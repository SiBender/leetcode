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
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = findNewHeadRemovingValue(head, val);
        if (newHead == null)
            return null;
        
        ListNode rearNode = null;
        ListNode frontNode = newHead;
        
        while (frontNode != null) {
            if (frontNode.val != val) {
                rearNode = frontNode;
                frontNode = frontNode.next;
            } else {
                frontNode = frontNode.next;
                rearNode.next = frontNode;
            }
               
        }
        
        return newHead;
    }
    
    private ListNode findNewHeadRemovingValue(ListNode head, int val) {
        ListNode currentNode = head;
        while (currentNode != null && currentNode.val == val) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
}