# Diagonal Sum in Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a square matrix of size  **n**  **×n**. Your task is to calculate the sum of its diagonals.

 **Note :** When n is odd, there is center value which is counted twice in the diagonal sum.

 **Examples:** 

```
Input: mat[][] = [[1, 0, 1], [0, 1, 0], [1, 0, 1]]

Output: 6

```

```
Input: mat[][] = [[1, 2], [3, 4]]
 
Output: 10
```

 **Constraints:** 
1 ≤ n ≤ 100
1 ≤ mat[i][j] ≤ 10000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T10:28:34.737Z  

```java


class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0;i<mat.length;i++){
            sum += mat[i][i];
            sum += mat[i][mat.length-1-i];
        }
        return sum;
        
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/diagonal-sum0158/1)