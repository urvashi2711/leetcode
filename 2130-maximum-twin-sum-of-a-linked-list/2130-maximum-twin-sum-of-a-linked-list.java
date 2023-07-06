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
    public int pairSum(ListNode head) {
        //find mid
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // reverse half linkedlist
        ListNode nextnode;
        ListNode prev=null;
        while(slow!=null){
            nextnode=slow.next;
            slow.next=prev;
            prev=slow;
            slow=nextnode;
        }
        //now find max sum
        int maxval=0;
        while(prev!=null){
            maxval=Math.max(maxval,(head.val+prev.val));
            prev=prev.next;
            head=head.next;
        }
        return maxval;
    }
}