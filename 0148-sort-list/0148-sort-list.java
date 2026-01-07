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
    public ListNode findmiddle(ListNode head){
        ListNode turtle=head;
        ListNode hare=head.next;
        while(hare!=null && hare.next!=null){
            turtle=turtle.next;
            hare=hare.next.next;
        }
        return turtle;
     }
     public ListNode merge(ListNode list1, ListNode list2){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(list1!=null && list2!=null){
            if(list1.val <=list2.val){
                temp.next=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null){
            temp.next=list1;
        }
        else{
            temp.next=list2;
        }
        return dummy.next;
     }
    public ListNode sortList(ListNode head) {
        if(head==null ||head.next==null){
            return head;
        }
        ListNode middle= findmiddle(head);
        ListNode righthead=middle.next;
        middle.next=null;
        ListNode lefthead=head;
        lefthead=sortList(lefthead);
        righthead=sortList(righthead);
return merge(lefthead,righthead);
    }
}