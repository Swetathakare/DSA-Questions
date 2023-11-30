package practice;
import java.util.*;

public class TappingRainwater {

	static Scanner sc = new Scanner(System.in);

	public static int trap(int[] height) {

		int n = height.length;
		int ans = 0;
		int leftMax[] = new int[n];
		int rightMax[] = new int[n];

		leftMax[0] = height[0];

		for (int i = 1; i < n; i++) {
			if (i == 1) {
				leftMax[i] = height[i - 1];
			} else {
				leftMax[i] = Math.max(height[i - 1], leftMax[i - 1]);
			}
		}
		rightMax[n - 1] = height[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			if (i == n - 2) {
				rightMax[i] = height[n - 1];
			} else {
				rightMax[i] = Math.max(height[i + 1], rightMax[i + 1]);
			}
		}
		for (int i = 0; i < n; i++) {

			int currWater = Math.min(rightMax[i], leftMax[i]) - height[i];
			if (currWater > 0) {
				ans += currWater;
			}
		}
		return ans;
	}

	static void printArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {

		int array[] = { 4, 2, 0, 3, 2, 5 };
		System.out.println("Height Array :");
		printArray(array);
		System.out.println("Rainwater Trapped :" + trap(array));
	}
}
/*
 
Output:
-------------------
Height Array :
0 1 0 2 1 0 1 3 2 1 2 1 
Rainwater Trapped :6
-------------------
Height Array :
4 2 0 3 2 5 
Rainwater Trapped :9
----------------------

*/
