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
   public ListNode merge(ListNode list1, ListNode list2){
    ListNode dummy = new ListNode(-1);
    ListNode temp = dummy;

    while(list1 != null && list2 != null){
        if(list1.val <= list2.val){
            temp.next = list1;
            list1 = list1.next;
        } else {
            temp.next = list2;
            list2 = list2.next;
        }
        temp = temp.next;
    }

    // ✅ FIX HERE
    if(list1 != null){
        temp.next = list1;
    } else {
        temp.next = list2;
    }

    return dummy.next;
}
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length<1)return null;
        int i=1;
            ListNode first=lists[0];
        while(i<lists.length){
            ListNode second=lists[i];
            first=merge(first,second);
            i++;
        }
        return first;
    }
}