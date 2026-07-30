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

        if (head == null || head.next == null) {
            return;
        }
        
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            n=n+1;
            temp=temp.next;
        }
        temp=head;
        int mid=n/2;

        for(int i=0;i<mid;i++){
            temp=temp.next;
        }

        ListNode sec=reverse(temp.next);

        temp.next=null;

        ListNode first=head;

        while(sec!=null){
            ListNode temp1=first.next;
            ListNode temp2=sec.next;

            first.next=sec;
            sec.next=temp1;

            first=temp1;
            sec=temp2;
        }

        

    }
    ListNode reverse(ListNode head){
            
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

}
