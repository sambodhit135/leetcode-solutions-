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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null || head==null)
        {
            return true;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode Next=slow.next;
        ListNode prev=null;
        while(Next!=null)
        {
            ListNode current=Next.next;
            Next.next=prev;
            prev=Next;
            Next=current;
        }
        slow.next=null;

        while(head!=null && prev!=null)
        {
            if(prev.val!=head.val)
            {
                return false;
            }
            head=head.next;
            prev=prev.next;
        }
        
        // if(head!=null || prev!=null)
        // {
        //     return false;
        // }
        return true;
    }
}