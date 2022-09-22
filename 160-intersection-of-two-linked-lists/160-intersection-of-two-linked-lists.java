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
public class Solution 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode a = headA;
        ListNode b = headB;
        
        
        while(a!=null && b!=null)
        {            
            if(a == b)
                return a;
            
            if(a.next == null)
            {
                a = headB;
                b = b.next;
                continue;
            }
            
            if(b.next == null)
            {
                b = headA;
                a = a.next;
                continue;
            }
                        
            a = a.next;
            b = b.next;
        }
        
        return null;
    }
}