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
    public ListNode reverseList(ListNode head) 
    {
    ArrayList<Integer> list=new ArrayList<>();
     ListNode temp=head;

     while(temp!=null)
     {
        list.add(temp.val);
        temp=temp.next;
     }
     int n=list.size();
     temp=head;

     while(temp!=null)
     {
        temp.val=list.get(n-1);
        temp=temp.next;
        n--;
     }

     return head;
    }
}