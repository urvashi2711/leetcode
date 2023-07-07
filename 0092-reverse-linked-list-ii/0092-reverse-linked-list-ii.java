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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int i=1;
        ListNode fakehead=new ListNode(0);
        fakehead.next=head;
        ListNode prev=fakehead;
        ListNode cur=fakehead.next;
        while(i<left){
            prev=cur;
            cur=cur.next;
            i++;
        }
        ListNode node=prev;
        while(i<=right){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
            i++;
        }
        node.next.next=cur;
        node.next=prev;
        return fakehead.next;
    }
}