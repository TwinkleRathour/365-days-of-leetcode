// Day 13 of 365 - LeetCode #219: Contains Duplicate II
// Difficulty: Easy
// Approach: Sliding Window + HashSet
// Runtime: 20ms | beats 94.82%
// Memory: 80.87MB | beats 51.97%

import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!window.add(nums[i])) { // duplicate found within window
                return true;
            }
            if (window.size() > k) {   // shrink window if size exceeds k
                window.remove(nums[i - k]);
            }
        }
        return false; // no nearby duplicate found
    }
}