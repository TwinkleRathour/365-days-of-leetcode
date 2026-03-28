/**
 * LeetCode 48 - Rotate Image
 *
 * Given an n x n 2D matrix representing an image,
 * rotate the matrix 90 degrees clockwise — in-place.
 *
 * Approach: Transpose + Reverse each row
 *   Step 1 - Transpose: Swap matrix[i][j] with matrix[j][i]
 *            (converts rows into columns)
 *   Step 2 - Reverse each row using two pointers
 *            (flips columns to achieve clockwise rotation)
 *
 * Why this works:
 *   Clockwise 90° rotation = Transpose + Horizontal Reverse
 *
 * Time Complexity:  O(n²) - every element is visited
 * Space Complexity: O(1)  - in-place, no extra matrix used
 *
 * Example:
 *   Input:  [[1,2,3],[4,5,6],[7,8,9]]
 *   After Transpose: [[1,4,7],[2,5,8],[3,6,9]]
 *   After Reverse:   [[7,4,1],[8,5,2],[9,6,3]]  ✓
 */
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix (swap across the diagonal)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row using two pointers
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}