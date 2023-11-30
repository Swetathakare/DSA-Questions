package practice;
import java.util.*;

public class BestTimeToBuyAndSellStock {

	static Scanner sc = new Scanner(System.in);

	public static int maxProfit(int[] prices) {

		int maxProfit = 0;
		int minStockPrice = prices[0];

		for (int i = 1; i < prices.length; i++) {
			if ((prices[i] - minStockPrice) > maxProfit) {
				maxProfit = prices[i] - minStockPrice;
			}
			if (prices[i] < minStockPrice) {
				minStockPrice = prices[i];
			}
		}
		return maxProfit;
	}

	static void printArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {

		int array[] = { 7, 6, 4, 3, 1 };
		System.out.println("Array :");
		printArray(array);
		System.out.println("Maximum Profit :" + maxProfit(array));
	}
}
/*
 
Output:
-------------------
Array :
7 1 5 3 6 4 
Maximum Profit :5
-------------------
Array :
7 6 4 3 1 
Maximum Profit :0
----------------------

*/
