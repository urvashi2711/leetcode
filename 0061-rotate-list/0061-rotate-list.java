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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        int size=1;//we are already at head
        while(fast.next!=null){
            size++;
            fast=fast.next;
        }
        for(int i=size-k%size;i>1;i--){
            slow=slow.next;
        }
        fast.next=head;
        head=slow.next;
        slow.next=null;
        return head;
    }
}
