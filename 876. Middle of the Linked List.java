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
    public ListNode middleNode(ListNode head) {
        // ...error checking
        if (head == null) {
            return null;
        }

        // ...fast and slow pointer strategy;
        ListNode fast = head;
        ListNode slow = head;

        // ...move fast two times and slow one time;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // ...return slow pointer;
        return slow;
    }
}