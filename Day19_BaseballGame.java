/**
 * Problem: 682. Baseball Game
 * Difficulty: Easy
 * Platform: LeetCode
 *
 * Description:
 * You are given a list of operations representing a baseball game score system.
 * You need to calculate the total score after performing all operations.
 *
 * Operations:
 * 1. Integer (x) → Add score x
 * 2. "+" → Add sum of last two scores
 * 3. "D" → Add double of last score
 * 4. "C" → Remove last score
 *
 * Approach:
 * - Use an array as a stack for better performance (faster than Stack class)
 * - Maintain a pointer 'top' to track last index
 * - Process each operation accordingly
 * - Finally, calculate the sum of valid scores
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Author: Twinkle Rathour
 * Day: 19/365 Days of LeetCode
 */

class Solution {

    public int calPoints(String[] operations) {

        // Array acting as stack (optimized)
        int[] arr = new int[operations.length];
        int top = -1;

        for (String op : operations) {

            char c = op.charAt(0);

            if (c == 'C') {
                // Remove last score
                top--;

            } else if (c == 'D') {
                // Double last score
                arr[++top] = 2 * arr[top - 1];

            } else if (c == '+') {
                // Sum of last two scores
                arr[++top] = arr[top - 1] + arr[top - 2];

            } else {
                // Convert string to integer
                arr[++top] = Integer.parseInt(op);
            }
        }

        // Calculate total sum
        int sum = 0;
        for (int i = 0; i <= top; i++) {
            sum += arr[i];
        }

        return sum;
    }
}