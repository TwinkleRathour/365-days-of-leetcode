// LeetCode #4 - Median of Two Sorted Arrays
// Approach: Merge both arrays, sort, then find median
// Time Complexity: O((m+n) log(m+n)) - due to Arrays.sort()
// Space Complexity: O(m+n) - for the merged temp array

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int size = m + n;

        // Create a merged array of total size
        int[] temp = new int[size];

        // Copy all elements of nums1 into temp starting at index 0
        for (int i = 0; i < m; i++) {
            temp[i] = nums1[i];
        }

        // Copy all elements of nums2 into temp starting after nums1 elements
        for (int i = 0; i < n; i++) {
            temp[m + i] = nums2[i];
        }

        // Sort the merged array to get elements in ascending order
        Arrays.sort(temp);

        double result = 0;

        if (size % 2 == 0) {
            // Even total size: median is average of two middle elements
            result = ((temp[size / 2 - 1]) + (temp[size / 2])) / 2.0;
        } else {
            // Odd total size: median is the middle element
            result = temp[(size + 1) / 2 - 1];
        }

        return result;
    }
}