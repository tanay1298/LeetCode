/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) 
    {
        ListNode p = node;
        ListNode n = node.next;
        
        while(n.next != null)
        {
            p.val = n.val;
            p = n;
            n = n.next;
        }
        
        p.val = n.val;;
        p.next = null;
    }
}