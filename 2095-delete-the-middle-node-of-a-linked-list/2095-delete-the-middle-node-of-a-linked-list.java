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
    public ListNode deleteMiddle(ListNode head) {
        ListNode turtle=head;
        ListNode hare=head;
        ListNode prev=head;
        if(head.next==null){
            return null;
        }
        while(  hare!=null && hare.next!=null){
            prev=turtle;
            turtle=turtle.next;
            hare=hare.next.next;
        }
        prev.next=turtle.next;
        return head;
    }
}