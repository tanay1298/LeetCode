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
class Solution 
{
    public int getLength(ListNode head)
    {
        ListNode t = head;
        int c =0;
        
        while(t!=null)
        {
            c++;
            t=t.next;
        }
        return c;
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int len = getLength(head);
        int k = len-n+1; //from start
        
        if(len==1 && k==1)
            return head.next;
        
        if(k==1)
            return head.next;
        
        ListNode t = head;
        ListNode p = null;
        int c=0;
        
        System.out.println(len);
        System.out.println(k);

        
        while(t!=null && c!=k-1)
        {
            c++;
            p = t;
            t = t.next;
        }
        
        if(t.next!=null)
        {
            p.next = t.next;
        }
        else
            p.next = null;
        
        return head;
    }
}