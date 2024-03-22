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
    public boolean isPalindrome(ListNode head) 
    {
     ListNode q=head;
     ListNode head2=null; 
     
     while(q!=null)
     {
        ListNode temp=new ListNode(q.val,head2);
        head2=temp;
        q=q.next;
     } 
     q=head;
     ListNode p=head2;
     while(q!=null)
     {
        if(p.val != q.val)
        {
            return false;
        }
        p=p.next;
        q=q.next;
     } 
     return true;

    }
}