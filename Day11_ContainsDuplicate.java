/**
 * Problem 217: Contains Duplicate (Easy)
 * Link: https://leetcode.com/problems/contains-duplicate/
 *
 * Approach: Sorting
 * Time Complexity:  O(n log n)
 * Space Complexity: O(1)
 */

public class Day11_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            // Check if adjacent elements are equal after sorting
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Day11_ContainsDuplicate solution = new Day11_ContainsDuplicate();

        boolean r1 = solution.containsDuplicate(new int[]{1, 2, 3, 1});
        System.out.println("Test 1: " + r1); // true

        boolean r2 = solution.containsDuplicate(new int[]{1, 2, 3, 4});
        System.out.println("Test 2: " + r2); // false

        boolean r3 = solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
        System.out.println("Test 3: " + r3); // true
    }
}