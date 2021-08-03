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
        ListNode surrogateHead = new ListNode(0, head);
        ListNode fast = head;
        ListNode slow = head;
        ListNode preDelete = surrogateHead;
        
        for(int i = 0; i < n - 1 ; i++) {
            fast = fast.next;
        }
        
        while(fast.next != null) {
            fast = fast.next;
            preDelete = slow;
            slow = slow.next;
        }
        
        preDelete.next = slow.next;
        return surrogateHead.next;
    }
}