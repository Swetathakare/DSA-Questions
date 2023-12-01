package practice;

import java.util.*;

public class StaircaseSearch {

	static Scanner sc = new Scanner(System.in);

	public static boolean searchMatrix(int[][] matrix, int target) {

		int row = 0;
		int col = matrix[0].length - 1;

		while (row < matrix.length && col >= 0) {

			if (matrix[row][col] == target) {
				return true;
			}
			if (matrix[row][col] > target) {
				col--;
			} else {
				row++;
			}
		}
		return false;
	}

	public static void main(String args[]) {

		int array[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		System.out.println("Enter number you want to search :");
		int target = sc.nextInt();
		if (searchMatrix(array, target)) {
			System.out.println("Number is present!");
		} else {
			System.out.println("Number is not present!");
		}
	}
}
/*
 
Output:

---------------------
Enter number you want to search :
13
Number is not present!
----------------------
Enter number you want to search :
3
Number is present!
---------------------
*/
