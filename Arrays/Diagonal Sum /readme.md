# 1572. Matrix Diagonal Sum

Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

 
----------
Example 1:
-----------

![Screenshot (420)](https://github.com/Swetathakare/DSA-Java-Questions/assets/143093330/63a65add-6d5f-465c-9181-a6a06685326f)

    Input: mat =  [[1,2,3],

                  [4,5,6],
              
                  [7,8,9]]
Output: 25

Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25

Notice that element mat[1][1] = 5 is counted only once.

-----------
Example 2:
----------

    Input: mat = [[1,1,1,1],

                  [1,1,1,1],
              
                  [1,1,1,1],
              
                  [1,1,1,1]]
              
Output: 8

------------
Example 3:
-----------

Input: mat = [[5]]

Output: 5
