# Sum of Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a non-null integer matrix  **mat[][]**  of size  **n × m**, compute the sum of all its elements.

 **Examples:** 

```
Input: mat[][] = [[1, 0, 1],
                [-8, 9, -2]]
Output: 1
Explanation: The sum of all elements of the matrix is: (1 + 0 + 1 - 8 + 9 - 2) = 1.
```

```
Input: mat[][] = [[1, 0, 1, 0, 1],
                [0, 1, 0, 1, 0],
               [-1, -1, -1, -1, -1]]
Output: 0
Explanation: The sum of all elements of the matrix is: (1 + 0 + 1 + 0 + 1 + 0 + 1 + 0 + 1 + 0 - 1 - 1 - 1 - 1 - 1) = 0.
```

 **Constraints:** 
1 ≤ n, m ≤ 103
-103 ≤ mat[i][j] ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T10:50:31.011Z  

```java
class Solution {
    public int sumOfMatrix(int[][] mat) {
        // code here
        int sum = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                sum += mat[i][j];
            }
        }
        return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-elements-in-a-matrix2000/1)