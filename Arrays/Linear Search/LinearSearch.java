package practice;

import java.util.*;

public class LinearSearch {
	
	static Scanner sc = new Scanner(System.in);

	static int search(int array[], int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String args[]) {

		int array[] = { 23, 221, 36, 33, 2, 1112, 112 };

		System.out.println("Enter element to search :");
		int key = sc.nextInt();
		int index = search(array, key);

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
2332
Element Not Found!
-----------------------------
Enter element to search :
112
Element found at index 6
------------------------------
 */
 
