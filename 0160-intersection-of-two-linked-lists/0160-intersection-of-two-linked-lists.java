/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        Set<ListNode> set=new HashSet<>();

        ListNode ptr1=headA;

        while(ptr1!=null)
        {
            set.add(ptr1);
            ptr1=ptr1.next;
        }

        ListNode ptr2=headB;

        while(ptr2!=null)
        {
            if(set.contains(ptr2))
                return ptr2;
            ptr2=ptr2.next;
        }

        return null;

    }
}