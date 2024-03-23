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
    public void reorderList(ListNode head) 
    {
     if(head==null || head.next==null)
     {
        return;
     }
     ListNode mid=middleNode(head);
     ListNode hf=head;
     ListNode hs=reverseNode(mid);

     while(hf!=null && hs!=null)
     {
        ListNode temp=hf.next;
        hf.next=hs;
        hf=temp;

        temp=hs.next;
        hs.next=hf;
        hs=temp;
     }
     if(hf!=null)
     {
        hf.next=null;
     }
     return;
    }

    public ListNode middleNode(ListNode head)
    {
        ListNode f=head,s=head;

        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        return s;
    }

    public ListNode reverseNode(ListNode head)
    {
        if(head==null)
        {
            return head;
        }
        ListNode prev=null,pres=head,next=pres.next;

        while(pres!=null)
        {
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null)
            {
                next=next.next;
            }
        }
        return prev;
    }
}