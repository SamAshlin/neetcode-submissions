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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int c=n;

        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode t1=dummy;
        ListNode t2=dummy;

        while(c>=0){
            t2=t2.next;
            c--;
        }

        while(t2!=null){
            t2=t2.next;
            t1=t1.next;
        }

        if(t1.next!=null){
            t1.next=t1.next.next;
        }

        return dummy.next;

    }
}
