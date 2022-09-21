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
        ListNode t1 = l1;
        ListNode t2 = l2;
        int d=0;
        int c=0;
        
        while(t1!=null && t2!=null)
        {
            int x = t1.val + t2.val + c;
            d = x%10;
            c = x/10;            
            t1.val = d;
            
            t1=t1.next;
            t2=t2.next;
        }
                
        while(t1!=null)
        {            
            int x = t1.val + c;
            d = x%10;
            c = x/10; 
            t1.val = d;
            t1 = t1.next;
        }
        
        t1 = l1;
        while(t1.next!=null)
            t1 = t1.next;
                
        while(t2!=null)
        {
            ListNode n = new ListNode();
            
            int x = t2.val + c;
            d = x%10;
            c = x/10; 
            
            n.val = d;
            t1.next = n;
            t1 = t1.next;
            t2=t2.next;
        }
        
        if(c>0)
            t1.next = new ListNode(c);
        
        return l1;
    }
}