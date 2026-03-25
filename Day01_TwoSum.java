/**
 * Problem 1: Two Sum (Easy)
 * Link: https://leetcode.com/problems/two-sum/
 *
 * Approach: Brute Force (Nested Loops)
 * Time Complexity:  O(n^2)
 * Space Complexity: O(1)
 */

public class Day01_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int arr[] = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if this pair sums to target
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Day01_TwoSum solution = new Day01_TwoSum();

        int[] r1 = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Test 1: [" + r1[0] + ", " + r1[1] + "]"); // [0, 1]

        int[] r2 = solution.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("Test 2: [" + r2[0] + ", " + r2[1] + "]"); // [1, 2]

        int[] r3 = solution.twoSum(new int[]{3, 3}, 6);
        System.out.println("Test 3: [" + r3[0] + ", " + r3[1] + "]"); // [0, 1]
    }
}
