// Day 12 of 365 - LeetCode #9: Palindrome Number
// Difficulty: Easy
// Approach: Two Pointers on String
// Runtime: 6ms | Beats 22.58%
// Memory: 45.86MB | Beats 79.78%

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;         // negative numbers are never palindromes
        String s = String.valueOf(x);     // convert int to string
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {  // mismatch found
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}