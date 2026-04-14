/**
 * Problem: Finding Pairs With a Certain Sum (LeetCode #1865)
 * Difficulty: Medium
 *
 * Description:
 * You are given two integer arrays nums1 and nums2.
 *
 * You need to design a data structure that supports:
 *
 * 1. add(index, val):
 *    - Add a positive integer val to nums2[index]
 *
 * 2. count(tot):
 *    - Count the number of pairs (i, j) such that:
 *      nums1[i] + nums2[j] == tot
 *
 * Approach:
 * - Use a HashMap to store frequency of elements in nums2
 * - For count:
 *      For each element in nums1,
 *      check if (tot - nums1[i]) exists in map
 *
 * - For add:
 *      Update frequency map accordingly
 */

import java.util.*;

class FindSumPairs {

    private int[] nums1, nums2;

    // Frequency map for nums2
    private Map<Integer, Integer> freq = new HashMap<>();

    // Constructor
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;

        // Build frequency map for nums2
        for (int num : nums2) {
            freq.merge(num, 1, Integer::sum);
        }
    }

    /**
     * add operation:
     * - Update nums2[index]
     * - Maintain freq map
     */
    public void add(int index, int val) {

        // Decrease old value frequency
        freq.merge(nums2[index], -1, Integer::sum);

        // Remove if frequency becomes 0
        if (freq.get(nums2[index]) == 0) {
            freq.remove(nums2[index]);
        }

        // Update value
        nums2[index] += val;

        // Add new value frequency
        freq.merge(nums2[index], 1, Integer::sum);
    }

    /**
     * count operation:
     * - For each element in nums1
     * - Find complement in nums2 using hashmap
     */
    public int count(int tot) {

        int count = 0;

        for (int num : nums1) {
            int target = tot - num;

            // If complement exists
            count += freq.getOrDefault(target, 0);
        }

        return count;
    }
}