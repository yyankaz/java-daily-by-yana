# Two Sum. HashMap + Return Index

Given an array of integers `nums` and an integer `target`, return the indices of the **two numbers** such that they add up to `target`.

You may assume that **each input would have exactly one solution**, and you may not use the same element twice.

You can return the answer in any order.

### Example 1:
Input: nums = [2, 7, 11, 15], target = 9  
Output: [0, 1]  
(Explanation: nums[0] + nums[1] = 2 + 7 = 9)

### Example 2:
Input: nums = [3, 2, 4], target = 6  
Output: [1, 2]  
(Explanation: nums[1] + nums[2] = 2 + 4 = 6)

### Example 3:
Input: nums = [3, 3], target = 6  
Output: [0, 1]

---

### Constraints:
- Time complexity should be **O(n)**.
- Use a **HashMap** to store previously seen numbers and their indices.
- Don't use the same element twice (i ≠ j).