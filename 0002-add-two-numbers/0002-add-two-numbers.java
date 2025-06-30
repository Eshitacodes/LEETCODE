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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode p1=l1;
        ListNode p2=l2;
        int sum=0;
        int carry=0;
        ListNode start=null;

        while(p1!=null && p2!=null)
        {
            sum=p1.val+p2.val+carry;
            if(sum>9)
            {
                start=insertEnd(sum%10,start);
                carry=1;
            }

            else
            {
                start=insertEnd(sum,start);
                carry=0;
            }
            sum=0;
            p1=p1.next;
            p2=p2.next;

        }

        
        while(p1!=null)
        {
            sum=p1.val+carry;
            if(sum>9)
            {
                start=insertEnd(sum%10,start);
                carry=1;
            }
            else
            {
                start=insertEnd(sum,start);
                carry=0;
            }
            sum=0;
            p1=p1.next;
        }

        while(p2!=null)
        {
            sum=p2.val+carry;
            if(sum>9)
            {
                start=insertEnd(sum%10,start);
                carry=1;
            }
            else
            {
                start=insertEnd(sum,start);
                carry=0;
            }
           sum=0;
            p2=p2.next;
        }

        if(carry!=0)
        {
            start=insertEnd(carry,start);
        }
        return start;

    }

    public static ListNode insertEnd(int val,ListNode start)
    {
            ListNode temp=new ListNode(val,null);

            if(start==null)
            {
                start=temp;
            }

            else
            {
                ListNode q=start;
                for(;q.next!=null;q=q.next);
                q.next=temp;
            }

            return start;
        
    }
}