/**
 * Problem 33: Search in Rotated Sorted Array (Medium)
 * Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
 *
 * Approach: Binary Search
 * Time Complexity:  O(log n)
 * Space Complexity: O(1)
 * Runtime: 0ms — Beats 100%
 * Date: 26-03-2026
 */

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[left] <= nums[mid]) {        // left half is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;                   // target in left half
                } else {
                    left = mid + 1;                    // target in right half
                }
            }
            else {                                     // right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;                    // target in right half
                } else {
                    right = mid - 1;                   // target in left half
                }
            }
        }

        return -1;
    }

    // ── Test Cases ──────────────────────────────────────────────
    public static void main(String[] args) {
        SearchInRotatedSortedArray sol = new SearchInRotatedSortedArray();

        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(sol.search(nums1, 0));   // Expected: 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(sol.search(nums2, 3));   // Expected: -1

        int[] nums3 = {1};
        System.out.println(sol.search(nums3, 0));   // Expected: -1
    }
}