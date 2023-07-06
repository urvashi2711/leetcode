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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        //find mid
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        ListNode l1=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode l2=reverse(slow);
        merge(l1,l2);
        }
       
   
     public ListNode reverse(ListNode head){
        ListNode nextnode;
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            nextnode=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nextnode;
        }
        return prev;
    }
    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        l1.next = merge(l2, l1.next);
        return l1;
 }
}