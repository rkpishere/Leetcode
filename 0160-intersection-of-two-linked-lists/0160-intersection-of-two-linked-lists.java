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
        ListNode turtle1=headA;
        ListNode turtle2=headB;

        while(turtle1!=null){
            turtle2=headB;
            while(turtle2!=null){
                if(turtle1==turtle2)
                {
                    return turtle1;
                }
                turtle2=turtle2.next;
            }
            turtle1=turtle1.next;
        }
        return null;
    }
}