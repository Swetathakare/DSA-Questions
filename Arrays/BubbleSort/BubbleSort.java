package practice;
import java.util.*;

public class BubbleSort {
	static Scanner sc = new Scanner(System.in);

	static void bubbleSort(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {

				if (array[j] > array[j + 1]) {

					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
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
		bubbleSort(array);
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
