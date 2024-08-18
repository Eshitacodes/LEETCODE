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
        ListNode p=l1;
        ListNode q=l2;
        int sum=0;
        int rem=0;
        ListNode start=null;

        while(p!=null && q!=null)
        {
            sum=p.val+q.val+rem;

            if(sum>9)
            {
                start=insertEnd(sum%10,start);
                rem=1;
            }
            else
            {
                start=insertEnd(sum,start);
                 rem=0;
            }
            sum=0;
            p=p.next;
            q=q.next;
                
        }

        if(q!=null)
        {
            while(q!=null)
            {
                sum=q.val+rem;
                if(sum>9)
                {
                    start=insertEnd(sum%10,start);
                    rem=1;
                }
                else
                {
                    start=insertEnd(sum,start);
                    rem=0;
                }
                sum=0;
                q=q.next;
            }
            
        }

        if(p!=null)
        {
            while(p!=null)
            {
                sum=p.val+rem;
                if(sum>9)
                {
                    start=insertEnd(sum%10,start);
                    rem=1;
                }
                else
                {
                    start=insertEnd(sum,start);
                    rem=0;
                }
                sum=0;
                p=p.next;
            }
        }

        if(rem!=0)
        {
            start=insertEnd(rem,start);
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