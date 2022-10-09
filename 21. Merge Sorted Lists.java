// Link : https://leetcode.com/problems/merge-two-sorted-lists/
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // if any of the list is null, other one is the result;
        if (list1 == null || list2 == null) {
            return (list1 == null) ? list2 : list1;
        }

        // init the merged list;
        ListNode merged = new ListNode();

        // ptr for iteration;
        ListNode ptr = merged;

        // iterator ptrs for lists;
        ListNode p = list1;
        ListNode q = list2;

        // unless one reaches null, this loop will work;
        while (p != null && q != null) {
            if (p.val < q.val) {
                ptr.next = new ListNode(p.val);
                p = p.next;
            } else if (p.val > q.val) {
                ptr.next = new ListNode(q.val);
                q = q.next;
            } else {
                ptr.next = new ListNode(p.val);
                ptr = ptr.next;
                ptr.next = new ListNode(p.val);
                p = p.next;
                q = q.next;
            }

            ptr = ptr.next;
        }

        // if either p or q is left, rest would be merged into the res list;
        if (p != null) {
            ptr.next = p;
        }

        if (q != null) {
            ptr.next = q;
        }

        return merged.next;
    }
}