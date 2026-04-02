/**
 * Problem: Spiral Matrix (LeetCode #54)
 * Difficulty: Medium
 *
 * Description:
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 *
 * Spiral order means traversing the matrix in this pattern:
 * → Left to Right
 * ↓ Top to Bottom
 * ← Right to Left
 * ↑ Bottom to Top
 * (repeat until all elements are covered)
 *
 * Example:
 * Input:
 * [ [1,2,3],
 *   [4,5,6],
 *   [7,8,9] ]
 *
 * Output:
 * [1,2,3,6,9,8,7,4,5]
 *
 * Task:
 * Traverse the matrix in spiral order and store elements in a list.
 */

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        // Final answer list
        List<Integer> result = new ArrayList<>();

        // Define boundaries
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        /**
         * Traverse until boundaries overlap
         */
        while (top <= bottom && left <= right) {

            /**
             * Step 1: Left → Right (Top Row)
             */
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // move top boundary down

            /**
             * Step 2: Top → Bottom (Right Column)
             */
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // move right boundary left

            /**
             * Step 3: Right → Left (Bottom Row)
             * Only if rows are still valid
             */
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // move bottom boundary up
            }

            /**
             * Step 4: Bottom → Top (Left Column)
             * Only if columns are still valid
             */
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // move left boundary right
            }
        }

        return result;
    }
}