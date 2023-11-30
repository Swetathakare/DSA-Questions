
package practice;
import java.util.*;

public class InsertionSort {
	static Scanner sc = new Scanner(System.in);


	static void insertionSort(int array[]) {

		for (int i = 1; i < array.length; i++) {
			int curr = array[i];
			int prev = i - 1;
			while (prev >= 0 && array[prev] > curr) {
				array[prev + 1] = array[prev];
				prev--;
			}
			array[prev + 1] = curr;
		}

	}

	static void printArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {

		int array[] = { 23, 21, 2, 4, 3, 2212, 32, -22, 2321, 886, 54, 33 };

		System.out.println("Original Array :");
		printArray(array);
		insertionSort(array);
		System.out.println("Sorted Array :");
		printArray(array);
	}
}
/*
 
Output:

Original Array :
23 21 2 4 3 2212 32 -22 2321 886 54 33 
Sorted Array :
-22 2 3 4 21 23 32 33 54 886 2212 2321 
*/
