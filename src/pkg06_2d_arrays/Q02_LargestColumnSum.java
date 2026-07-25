package pkg06_2d_arrays;

import java.util.Scanner;

/**
 * @author SUDHIR 
 * Question: Find the Largest Column Sum in a 2D Array *
 * Description: This program dynamically accepts a 2D array (matrix)
 *         from the user, calculates the total sum of elements for each
 *         individual column by iterating column-wise, and identifies the
 *         maximum column sum. 
 *         Sample Input/Output Example:
 *         ------------------------------------------- 
 *         SAMPLE INPUT: 
 *         Enter the  number of rows: 
 *         3 
 *         Enter the number of columns: 
 *         2 
 *         Enter element at Row 0, Column 0: 
 *         1  
 *         Enter element at Row 0, Column 1: 
 *         2 
 *         Enter element at Row 1, Column 0: 
 *         3         
 *         Enter element at Row 1, Column 1: 
 *         4 
 *         Enter element at Row 2, Column 0: 
 *         5 
 *         Enter element at Row 2, Column 1: 
 *         6 
 *         
 *         SAMPLE   OUTPUT: 
 *        --- Displaying 2D Array Elements --- 
 *         1 2 
 *         3 4 
 *         5 6 
 *         --- Final Output ---
 *         The largest column sum in the given matrix is: 12
 *         -------------------------------------------
 */
public class Q02_LargestColumnSum {

	public static int largestColumnSum(int arr[][]) {
		int rows = arr.length;
		int cols = arr[0].length;
		int largest = Integer.MIN_VALUE;

		for (int j = 0; j < cols; j++) {
			int sum = 0;

			for (int i = 0; i < rows; i++) {
				sum = sum + arr[i][j];
			}

			if (sum > largest) {
				largest = sum;
			}
		}

		return largest;
	}

	public static int[][] takeInput(Scanner sc) {
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();

		System.out.println("Enter the number of columns:");
		int cols = sc.nextInt();

		int input[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Enter element at Row " + i + ", Column " + j + ": ");
				input[i][j] = sc.nextInt();
			}
		}

		return input;
	}

	public static void printArray(int arr[][]) {
		int rows = arr.length;
		int cols = arr[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][] = takeInput(sc);

		System.out.println("\n--- Displaying 2D-Array Elements ---");
		printArray(arr);

		System.out.println("\n--- Final Output ---");
		System.out.println("The largest column sum in the given matrix is: " + largestColumnSum(arr));

		sc.close();
	}

}
