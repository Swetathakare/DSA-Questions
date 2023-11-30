# Prefix Sum Method 

-------------
Explaination:-
-------------

Note :- n is the length of array.

Prefix sum method to calculate subarray sum is used to eleminate the 3rd nested loop from the Brute force approach 
which changes the time complexity from ( O(n3) to O(n2) ).

![Screenshot (358)](https://github.com/Swetathakare/DSA-Java-Questions/assets/143093330/9ae7cb93-0cc4-4e1c-a200-209fe280ace6)

Step 1 ) :- We need to make a prefix sum array which will hold the sum of all elements before it (including current element).

Step 2 ) :- Instead of  looping from start to end to calculate the Current sum we canculate it by prefix[end] - prefix[start-1]  which gives the sum of all elements present between start to end , and we then compare that current Sum with the maximum sum if the currSum is greater that maximun Sum we update the value of maximum sum.

---------------
Time Complexity :- O(n)

Space Complexity :- O(n)
---------------------------
