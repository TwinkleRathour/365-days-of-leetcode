// Day 8 of 365 - LeetCode #26: Remove Duplicates from Sorted Array
// Difficulty: Easy
// Approach: Two Pointer
// Runtime: 1ms | beats 78.15%
// Memory: 46.20MB | beats 99.03%

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 1; // write pointer (starts at 1, since first element is always unique)

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) { // found a new unique element
                nums[j] = nums[i + 1];    // write it to the next available position
                j++;
            }
        }

        return j; // k = number of unique elements
    }
}