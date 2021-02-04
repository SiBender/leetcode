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
    public ListNode detectCycle(ListNode head) {
        int cicleLength = getCicleLength(head);
        
        if(cicleLength == -1) {return null;}
        
        ListNode start = head;
        ListNode end = head;
        
        for(int i = 0; i < cicleLength; i++) {
            end = end.next;
        }
        
        while(end.next != start) {
            start = start.next;
            end = end.next;
        }
        return start;
    }
    
    private int getCicleLength(ListNode head) {
        if (head == null) {return -1;}
        int cicleLength = 0;
        int slowSteps = 0, fastSteps = 0;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != slow) {
            if (fast.next == null) { return -1; } 
            
            fastSteps++;
            fast = fast.next;
            
            if (fast.next == null) { return -1; } 
            if (fast.next == slow) { break;}
            
            slowSteps++;
            slow = slow.next;
            fastSteps++;
            fast = fast.next;
        }
        
        return fastSteps - slowSteps;
    }
}
