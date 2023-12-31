

-----------------
# 53. Maximum Subarray  (Prefix Sum Method )
---------------------

Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.

 
----------------
Example 1:
---------------

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]

Output: 6

Explanation: The subarray [4,-1,2,1] has the largest sum 6.

----------------
Example 2:
---------------

Input: nums = [1]

Output: 1

Explanation: The subarray [1] has the largest sum 1.

----------------
Example 3:
---------------

Input: nums = [5,4,-1,7,8]

Output: 23

Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 
--------------
Constraints:
------------

1 <= nums.length <= 105
-104 <= nums[i] <= 104

-------------
Explaination:-
-------------

![Screenshot (360)](https://github.com/Swetathakare/DSA-Java-Questions/assets/143093330/70c35b58-8af5-4dd5-a273-ab1377551857)

Note :- n is the length of array.

Kadane's Algorithmn says you calculate the current sum of the array if at any point current sum becomes negative make current sum 0 adding negative number to the sum will never give sum greater than the current sum and constantly update maximun sum if current sum is greater than maximum .

At the end of the loop if maximum sum is zero then check if all the  numbers present in the array is negative or not if yes then return maximum number from the array otherwise return the calculated maximum sum.
