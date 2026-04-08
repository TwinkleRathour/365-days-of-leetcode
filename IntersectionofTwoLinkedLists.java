/**
 * Problem: Intersection of Two Linked Lists (LeetCode #160)
 * Difficulty: Easy
 *
 * Description:
 * Given the heads of two singly linked lists headA and headB,
 * return the node at which the two lists intersect.
 *
 * If the two linked lists have no intersection, return null.
 *
 * Important Notes:
 * - The linked lists must retain their original structure after the function returns.
 * - There are no cycles in the linked structure.
 *
 * Example:
 *
 * A: a1 → a2 → c1 → c2 → c3
 * B: b1 → b2 → b3 ↗
 *
 * Intersection Node = c1
 *
 * Approach Used: Two Pointer Technique
 */

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // Step 1: Initialize two pointers
        ListNode a = headA;
        ListNode b = headB;

        /**
         * Step 2: Traverse both lists
         *
         * Logic:
         * - Move both pointers one step at a time
         * - When a reaches end → redirect to headB
         * - When b reaches end → redirect to headA
         *
         * Why this works?
         * - Both pointers will travel equal distance:
         *   lengthA + lengthB
         * - So they will meet at intersection point
         *   OR both become null (if no intersection)
         */

        while (a != b) {

            // If a becomes null, jump to headB
            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            // If b becomes null, jump to headA
            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }

        /**
         * Step 3:
         * - Either intersection node OR null
         */
        return a;
    }
}