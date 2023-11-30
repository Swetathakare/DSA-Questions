package practice;
import java.util.*;

public class KadaneAlgo{

	static Scanner sc = new Scanner(System.in);

	public static int maxSubArray(int[] nums) {

		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;

		for (int i = 0; i < nums.length; i++) {

			currSum += nums[i];
			currSum = (currSum > 0) ? currSum : 0;
			maxSum = Math.max(maxSum, currSum);

		}
		if (maxSum == 0) {

			boolean checkAllNegative = true;
			int maxElement = Integer.MIN_VALUE;

			for (int i = 0; i < nums.length; i++) {

				if (nums[i] >= 0) {
					checkAllNegative = false;
					break;
				}

				maxElement = Math.max(nums[i], maxElement);
			}

			if (checkAllNegative) {
				return maxElement;
			}

		}
		return maxSum;
	}

	static void printArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {

		int array[] = { 5, 4, -1, 7, 8 };
		System.out.println("Array :");
		printArray(array);
		System.out.println("Maximum Subarray Sum :" + maxSubArray(array));
	}
}
/*
 
Output:
-------------------
Array :
-2 1 -3 4 -1 2 1 -5 4 
Maximum Subarray Sum :6
-------------------
Array :
5 4 -1 7 8 
Maximum Subarray Sum :23
----------------------

*/
