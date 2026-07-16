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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode trav = dummy;

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        while (temp1 != null && temp2 != null) {
            int sum = temp1.val + temp2.val + carry;
            if (sum >= 10) {
                sum = sum%10;
                carry = 1;
                trav.next = new ListNode(sum);
            } else {
                carry = 0;
                trav.next = new ListNode(sum);
            }
            trav = trav.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        while(temp1!=null)
        {
            int sum=temp1.val+carry;
               if (sum >= 10) {
                 sum = sum%10;
                carry = 1;
                trav.next = new ListNode(sum);
            } 
            else
            {
                 carry = 0;
                trav.next = new ListNode(sum);
            }
            trav = trav.next;
            temp1 = temp1.next;
        }

         while(temp2!=null)
        {
            int sum=temp2.val+carry;
               if (sum >= 10) {
                sum = sum%10;
                carry = 1;
                trav.next = new ListNode(sum);
            } 
            else
            {
                 carry = 0;
                trav.next = new ListNode(sum);
            }
            trav = trav.next;
            temp2 = temp2.next;
        }

        if(carry==1)
        {
              trav.next = new ListNode(1);
        }
    return dummy.next;
    }
}