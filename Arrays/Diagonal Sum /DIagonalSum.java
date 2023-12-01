package practice;

import java.util.*;

public class DIagonalSum {

	static Scanner sc = new Scanner(System.in);

	public static int diagonalSum(int[][] mat) {
        int ans =0;
        for(int i=0;i<mat.length;i++){
            ans += mat[i][i]+mat[i][mat.length-i-1];
        }
        if(mat.length%2!=0){
            ans -= mat[mat.length/2][mat.length/2];
        }
        return ans;
        
    }
	public static void main(String args[]) {

		int array[][] = {{1,2,3},
		                  {4,5,6},
		                  {7,8,9}};
		System.out.println("Diagonal Sum :" +diagonalSum(array));
	}
}
/*
 
Output:

---------------------
mat = [[1,2,3],
      [4,5,6],
      [7,8,9]]
Diagonal Sum :25
----------------------
mat = [[1,1,1,1],
      [1,1,1,1],
      [1,1,1,1],
      [1,1,1,1]]
Diagonal Sum :8
---------------------
*/
