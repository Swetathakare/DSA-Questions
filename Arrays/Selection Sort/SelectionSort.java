package practice;
import java.util.*;

public class SelectionSort {
	static Scanner sc = new Scanner(System.in);

	static void selectionSort(int array[]) {

		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i; j < array.length; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;

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
		selectionSort(array);
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
