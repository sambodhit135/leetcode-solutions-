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
    public ListNode rotateRight(ListNode head, int k) {
          if (head == null || head.next == null || k == 0) {
            return head;
        }
        int size=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            size++;
        }
        k=k%size;
         if (k == 0) {
            return head;
        }
        temp.next=head;
        k=size-k;

        temp=head;
        while(k>1)
        {
            temp=temp.next;
            k--;
        }

        head=temp.next;
        temp.next=null;
        return head;
    }
}