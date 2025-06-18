# Two Sum. HashSet

Given an array of integers `nums` and an integer `target`, return `true` if there are two distinct elements in the array such that their sum equals the target. Return `false` otherwise.

You should implement it efficiently — avoid using nested loops.

### Example 1:
Input: nums = [2, 7, 11, 15], target = 9  
Output: true  (2 + 7 = 9)

### Example 2:
Input: nums = [3, 3], target = 6  
Output: true

### Example 3:
Input: nums = [1, 2, 3], target = 6  
Output: false

### Constraints:
- Use a `Set` or `Map` to optimize the time complexity to O(n)
- The same element cannot be used twice (i ≠ j)