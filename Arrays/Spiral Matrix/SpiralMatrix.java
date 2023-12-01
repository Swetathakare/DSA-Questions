package practice;

import java.util.*;

public class SpiralMatrix {

	static Scanner sc = new Scanner(System.in);

	public static List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> ans = new ArrayList<>();

		int startrow = 0;
		int endcolumn = matrix[0].length - 1;
		int endrow = matrix.length - 1;
		int startcolumn = 0;

		while (startrow <= endrow && startcolumn <= endcolumn) {

			for (int i = startcolumn; i <= endcolumn; i++) {

				ans.add(matrix[startrow][i]);
			}
			startrow++;
			for (int i = startrow; i <= endrow; i++) {
				ans.add(matrix[i][endcolumn]);
			}
			endcolumn--;
			if (startrow > endrow || startcolumn > endcolumn) {
				break;
			}
			for (int i = endcolumn; i >= startcolumn; i--) {

				ans.add(matrix[endrow][i]);
			}
			endrow--;
			for (int i = endrow; i >= startrow; i--) {

				ans.add(matrix[i][startcolumn]);
			}
			startcolumn++;

		}
		return ans;
	}

	public static void main(String args[]) {

		int array[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		System.out.println("Spiral Elements :\n" + spiralOrder(array));
	}
}
/*
 
Output:

-------------------
Spiral Elements :
[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
----------------------

*/
