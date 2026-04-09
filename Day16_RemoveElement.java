// Day 16 of 365 - LeetCode #27: Remove Element
// Difficulty: Easy
// Approach: Two Pointer
// Runtime: 0ms | beats 100%

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}