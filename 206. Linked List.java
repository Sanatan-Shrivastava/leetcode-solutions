// Link : https://leetcode.com/problems/reverse-linked-list/
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
    public ListNode reverseList(ListNode head) {
        // init prev, curr, and next;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            // get the hold of rest of list in next ptr;
            next = curr.next;


            // now the prev of curr shall be next in the new list;
            curr.next = prev;

            // now let's move both ptrs to continue this on every node
            prev = curr;
            curr = next;
        }

        // prev shall be the new head;
        return prev;
    }
}