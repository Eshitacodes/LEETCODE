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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int count=0;
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
            count++;

        if(count==n)
            return head.next;
        
        int travNode=count-n;

        ListNode ptr=head;
        for(int i=1;i<travNode;i++)
            ptr=ptr.next;

        ptr.next=ptr.next.next;
        return head;


    }
}