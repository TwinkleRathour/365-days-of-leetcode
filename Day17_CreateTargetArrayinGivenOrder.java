/**
 * Problem: Create Target Array in Given Order (LeetCode #1389)
 * Difficulty: Easy
 *
 * Description:
 * Given two arrays nums and index,
 * create a target array such that:
 *
 * target[index[i]] = nums[i]
 *
 * Elements must be shifted to the right when inserting.
 *
 * Example:
 * Input:
 * nums  = [0,1,2,3,4]
 * index = [0,1,2,2,1]
 *
 * Output:
 * [0,4,1,3,2]
 *
 * Approach:
 * - Insert elements at given index
 * - Shift elements to right manually
 */

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        int[] target = new int[nums.length];

        // Traverse nums array
        for (int i = 0; i < nums.length; i++) {

            // Shift elements to the right
            for (int j = i; j > index[i]; j--) {
                target[j] = target[j - 1];
            }

            // Insert element
            target[index[i]] = nums[i];
        }

        return target;
    }
}