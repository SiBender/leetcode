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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode rearNode = null;
        ListNode middleNode = null;
        ListNode frontNode = head;
        
        while(frontNode.next != null) {
            if (middleNode != null) {
                middleNode.next = rearNode;    
            }
            
            
            rearNode = middleNode;
            middleNode = frontNode;
            frontNode = frontNode.next;
        }
 
        
    middleNode.next = rearNode;    
    frontNode.next = middleNode;    
        
    return frontNode;
    }
}