## Day 10 - LeetCode #136: Single Number

**Problem:** Given a non-empty array where every element appears twice 
except one, find that single number.

**Approach:** XOR Bit Manipulation  
- XOR of a number with itself = 0  
- XOR of a number with 0 = the number itself  
- XOR all elements → duplicates cancel out → single number remains

**Complexity:** Time: O(n) | Space: O(1)

**Result:** ✅ Accepted | Runtime: 1ms | Beats 99.98%
```java
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length; i++){
            result = result^nums[i];
        }
        return result;
    }
}
```