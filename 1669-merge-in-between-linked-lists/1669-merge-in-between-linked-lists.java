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
   
    public void traverse(ListNode list1, int a, int b, ListNode list2){
        ListNode curr=list1;
     
        
        ListNode start=list1;
        ListNode end=list1;
        int count=1;
        while(curr!=null){

            if(count==a){
                start=curr;
            }
            if(count==b+1)
                {
                    end=curr.next;
                    
                }
            count++;
            curr=curr.next;
            
        }
        curr=list2;
        while(curr!=null){
            start.next=curr;
            curr=curr.next;
            start=start.next;
        }
        start.next=end;
    }
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        traverse(list1, a,b,list2);
        return list1;
    }
}