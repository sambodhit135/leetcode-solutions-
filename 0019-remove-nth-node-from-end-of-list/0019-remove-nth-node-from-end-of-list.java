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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=1;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        n=size-n;
        int count=1;
        temp=head;
        if(n==1)
        {
            return head.next;
        }

        ListNode prev=null;
        
        while(temp!=null)
        {
            if(count==n)
            {
                prev.next=temp.next;
                break;
            }
            count++;
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}