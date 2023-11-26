package practice;

import java.util.*;

public class BinarySearch {

	static Scanner sc = new Scanner(System.in);

	static int search(int array[], int key, int start, int end) {
		if (start > end) {
			return -1;
		}
		int mid = start + (end - start) / 2;
		if (array[mid] == key) {
			return mid;
		}
		if (array[mid] > key) {
			return search(array, key, start, mid - 1);
		} else {
			return search(array, key, mid + 1, end);
		}
	}

	public static void main(String args[]) {

		// Array should be sorted for binary search

		int array[] = { 2, 556, 7778, 8888, 9988, 68896 };

		System.out.println("Enter element to search :");
		int key = sc.nextInt();
		int index = search(array, key, 0, array.length - 1);

		if (index == -1) {
			System.out.println("Element Not Found!");
		} else {
			System.out.println("Element found at index " + index);
		}
	}
}
/*
 OUTPUT:
----------------------------
Enter element to search :
69
Element Not Found!
-----------------------------
Enter element to search :
68896
Element found at index 5
------------------------------
 */
