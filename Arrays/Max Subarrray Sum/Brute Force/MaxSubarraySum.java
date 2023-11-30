package practice;
import java.util.*;

public class MaxSubarraySum {
	
	static Scanner sc = new Scanner(System.in);

	static void maxSubarraySum(int array[]) {
		
		int maxSum= Integer.MIN_VALUE;
		
		for(int i =0;i<array.length;i++) {
			for(int j =0;j<array.length;j++) {
				int currSum=0;
				for(int k=i;k<=j;k++ ){
					currSum+=array[k];
				}
				if(currSum>maxSum) {
					maxSum= currSum;
				}
			}
		}
		System.out.println("Maximum Sum :"+ maxSum);
	}
	static void printArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {

		int array[] = {1,-2,6,-1,3 };
        maxSubarraySum(array);
	}
}
/*
Output:

Maximum Sum :8

*/
