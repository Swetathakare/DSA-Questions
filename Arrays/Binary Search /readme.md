# Binary Search

------------------------------
Note :- The array Sequence must be sorted .
------------------------------

Step 1) Accept the key to be searched from the user.


Step 2) Calculate the middle element of the array.

Step 3)

   Base case) :At any point if the starting index is greater than the ending index that means the given key is not present in    the array then return -1 indicating the invalid index.

Case 1) :- If the key is same as the middle then return the mid index.

Case 2) :- If the key is greater than the desired value and array is sorted then the desired key must be in the left portion of the array then set ending index as (mid-1).

Case 3) :- If the key is less than the desired value and array is sorted then the desired key must be in the right portion of the array then set starting index as (start-1).





