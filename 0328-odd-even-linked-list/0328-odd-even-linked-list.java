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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = new ListNode(-1,null);
        ListNode curr1 = odd;
        ListNode even = new ListNode(-1,null);
        ListNode curr2 = even;
        boolean isodd = true;
        while(head != null){
            if(isodd){
                curr1.next = new ListNode(head.val,null);
                curr1 = curr1.next;
                isodd = false;
            }else{
                curr2.next = new ListNode(head.val,null);
                curr2 = curr2.next;
                isodd = true;
            }
            head = head.next;
        }
        head = odd.next;
        curr1.next = even.next;
        return head;
    }
}