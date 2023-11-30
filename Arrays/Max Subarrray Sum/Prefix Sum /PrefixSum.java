package practice;
import java.util.*;

public class PrefixSum {

	static Scanner sc = new Scanner(System.in);

	public static int maxSubArray(int[] nums) {
		int maxSum = Integer.MIN_VALUE;
		int n = nums.length;
		int prefixSumArr[] = new int[n];
		prefixSumArr[0] = nums[0];
		for (int i = 1; i < n; i++) {
			prefixSumArr[i] = prefixSumArr[i - 1] + nums[i];
		}
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (i == 0) {
					maxSum = Math.max(prefixSumArr[j], maxSum);
				} else {
					maxSum = Math.max(prefixSumArr[j] - prefixSumArr[i - 1], maxSum);
				}
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
