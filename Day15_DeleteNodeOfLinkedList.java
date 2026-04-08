// Day 15 of 365 - LeetCode #19: Remove Nth Node From End of List
// Difficulty: Medium
// Approach: Sentinel Node + Length Calculation
// Runtime: 0ms | beats 100%

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sentinel = new ListNode(0, head);
        ListNode prev = sentinel;

        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        for (int i = 0; i < length - n; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return sentinel.next;
    }
}