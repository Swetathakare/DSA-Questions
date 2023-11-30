# 42. Trapping Rain Water

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

-----
Example 1:
-------

Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]

![Screenshot (356)](https://github.com/Swetathakare/DSA-Java-Questions/assets/143093330/130daf83-57da-4567-8052-9011369bbebb)

Output: 6

Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

---------
Example 2:
----------

Input: height = [4,2,0,3,2,5]

Output: 9
 
----------------
Constraints:
----------

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105

----------------
Explaination:
----------
The water gets trapped when there is more heighted pillars on the left and right side. Hence we have to calculate the rightmost highest and leftmost heighest pillar for every pillar. The water trapped (above the pillar) will be the minimum of the rightmost and leftmost pillar - height of the pillar if the difference is positive then that will be the amount of water trapped above the pillar.
