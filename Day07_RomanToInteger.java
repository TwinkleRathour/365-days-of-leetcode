/**
 * Problem: Roman to Integer (LeetCode #13)
 * Difficulty: Easy
 *
 * Description:
 * Roman numerals are represented by seven symbols:
 * I(1), V(5), X(10), L(50), C(100), D(500), M(1000)
 *
 * Normally, symbols are written from largest to smallest (left to right).
 * But in some cases, a smaller value before a larger value means subtraction:
 *
 * Examples:
 * IV = 4   (5 - 1)
 * IX = 9   (10 - 1)
 * XL = 40  (50 - 10)
 * XC = 90  (100 - 10)
 * CD = 400 (500 - 100)
 * CM = 900 (1000 - 100)
 *
 * Task:
 * Convert a Roman numeral string into an integer.
 */

class Solution {
    public int romanToInt(String s) {

        // Final answer
        int ans = 0;

        // To store current numeral value
        int num = 0;

        // Traverse from RIGHT to LEFT
        for (int i = s.length() - 1; i >= 0; i--) {

            // Convert Roman character to integer
            switch (s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }

            /**
             * Logic:
             * If current value is smaller than previously added value,
             * then it should be subtracted.
             *
             * Trick used:
             * if (4 * num < ans)
             * → means current number is smaller and should be subtracted
             *
             * Example:
             * IV → from right:
             * V = 5 → ans = 5
             * I = 1 → 4*1 < 5 → subtract → ans = 4
             */

            if (4 * num < ans) {
                ans -= num;   // subtract case
            } else {
                ans += num;   // normal addition
            }
        }

        return ans;
    }
}