# Search a 2D Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an `m x n` integer matrix `matrix` with the following two properties:

- Each row is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.

Given an integer `target`, return `true`  *if*  `target`  *is in*  `matrix`  *or*  `false`  *otherwise*.

You must write a solution in `O(log(m * n))` time complexity.

 

 **Example 1:** 

```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

```

 **Example 2:** 

```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false

```

 

 **Constraints:** 

- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 100
- -104 <= matrix[i][j], target <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.4 MB (beats 98.55%)  
**Submitted:** 2026-10-15T11:31:25.051Z  

```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int i=0;
        int j = row*col-1;

        while(i<=j){
            int mid = (i+j)/2;

            row = mid/matrix[0].length;
            col = mid%matrix[0].length;

            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                j=mid-1;
            }
            else if(matrix[row][col]<target){
                i=mid+1;
            }

        }
    return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/search-a-2d-matrix/)