# 74. Search a 2D Matrix(Sorted)

You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.

The first integer of each row is greater than the last integer of the previous row.

Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

 
-----------
Example 1:
-----------

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3

Output: true


![Screenshot (419)_LI](https://github.com/Swetathakare/DSA-Java-Questions/assets/143093330/9f9b2346-7265-4c65-9dbf-695c4df81abf)


----------
Example 2:
----------

![Screenshot (420)_LI](https://github.com/Swetathakare/DSA-Java-Questions/assets/143093330/64eb611d-83dd-4fe5-877a-65d58e993754)

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13

Output: false

----------
Explaination:-
----------
Start from top-right corner and check if target is present if yes then return true else check if the target is smaller if yes then row++ else column-- again check until row < length  and  column > 0.
