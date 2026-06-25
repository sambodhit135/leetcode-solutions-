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
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;

        }
        n = size - n + 1;

        if (n == 1) {
            return head.next;
        }
        int count = 1;
        temp = head;
        ListNode prev = null;

        while (temp != null) {
            if (count == n) {
                prev.next = temp.next;
                break;
            }
            count++;
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}