/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return (l1 == null) ? l2 : l1;
        }

        ListNode head = new ListNode(0);
        ListNode ptr = head;

        int carry = 0;

        while (l1 != null || l2 != null) {
            // value of first node
            int v1 = (l1 != null) ? l1.val : 0;

            // value of second node
            int v2 = (l2 != null) ? l2.val : 0;

            // sum of the nodes;
            int sum = v1 + v2 + carry;
            ptr.next = new ListNode(sum % 10);
            carry = sum / 10;

            // if not null, move forward;
            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }

            // move the resulting pointer ahead by one;
            ptr = ptr.next;
        }

        // if carry isn't 0; means we have a 1 left, so add that to the answer;
        if (carry > 0) {
            ptr.next = new ListNode(1);

        }

        // return dummy head;
        return head.next;
    }
}