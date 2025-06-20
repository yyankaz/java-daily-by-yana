## Find the Second Largest Element in an Array

Write a function that returns the second largest number in a given array of integers.

You are **not allowed to use any sorting method** (`Arrays.sort()` or similar).

---

### Example 1:
Input: [10, 5, 20, 8, 15]  
Output: 15  
(Explanation: The largest is 20, second largest is 15)

### Example 2:
Input: [3, 1, 4, 4, 5, 5]  
Output: 4  
(Explanation: The largest is 5, second largest is 4)

### Example 3:
Input: [7, 7, 7]  
Output: There is no second largest value

---

### Constraints:
- Do not use sorting.
- Try to solve in **O(n)** time.
- If there is no second unique element, return something appropriate (e.g. `Integer.MIN_VALUE`, `-1`, or throw an exception).