/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) 
    {
        Set<ListNode> set=new HashSet<>();

        ListNode ptr=head;
        while(ptr!=null)
        {
            if(set.contains(ptr))
            {
                return ptr;
            }
            set.add(ptr);
            ptr=ptr.next;
        }
        return null;
    }
}