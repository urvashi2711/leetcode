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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode res= dummy;
        ListNode x = list1;
        ListNode y= list2;
        while(x!=null && y!=null){
            if(x.val <= y.val){
                dummy.next =  new ListNode(x.val);
                dummy=dummy.next;
                x=x.next;
            }
            else{
                dummy.next= new ListNode(y.val);
                dummy=dummy.next;
                y=y.next;
            }
        }
        while(x!=null){
            dummy.next = new ListNode(x.val);
            dummy=dummy.next;
            x=x.next;
        }
        while(y!=null){
            dummy.next = new ListNode(y.val);
            dummy=dummy.next;
            y=y.next;
        }
        return res.next;
    }
}