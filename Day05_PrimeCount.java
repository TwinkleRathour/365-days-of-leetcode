/**
 * LeetCode 204 - Count Primes
 * Difficulty: Medium
 *
 * Problem: Given an integer n, return the number of prime numbers strictly less than n.
 *
 * Approach: Sieve of Eratosthenes
 * - Create a boolean array where index represents the number
 * - Assume all numbers are prime initially (isComposite = false)
 * - For each prime i, mark all its multiples as composite
 * - Start marking from i*i (smaller multiples already handled by previous primes)
 * - Only iterate till sqrt(n) since any composite must have a factor <= sqrt(n)
 * - Finally count all indices still marked as prime
 *
 * Time Complexity:  O(n log log n)
 * Space Complexity: O(n)
 */
class Solution {
    public int countPrimes(int n) {

        // Edge case: no primes exist below 2
        if (n < 2) return 0;

        // isComposite[i] = false → i is prime, true → i is composite
        boolean[] isComposite = new boolean[n];

        // Sieve: eliminate multiples of each prime up to sqrt(n)
        for (int i = 2; i * i < n; i++) {

            // Only process if i is still marked as prime
            if (!isComposite[i]) {

                // Mark all multiples of i starting from i*i as composite
                // j += i steps through: i*i, i*(i+1), i*(i+2), ...
                for (int j = i * i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        // Count all numbers from 2 to n-1 that are still prime
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) count++;
        }

        return count;
    }
}