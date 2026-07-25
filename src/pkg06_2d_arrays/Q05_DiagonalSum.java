package pkg06_2d_arrays;

import java.util.Scanner;

/**
 * @author SUDHIR Question: Find the Sum of the Primary Diagonal * Description:
 *         This program accepts a square matrix from the user, calculates the
 *         sum of the primary diagonal elements (where row index equals column
 *         index), and displays the result. * Sample Input/Output Example:
 *         ------------------------------------------- SAMPLE INPUT: Enter the
 *         size of the square matrix: 3 Enter element at Row 0, Column 0: 1
 *         Enter element at Row 0, Column 1: 2 ... * SAMPLE OUTPUT: * ---
 *         Displaying 2D Array Elements --- 1 2 3 4 5 6 7 8 9 * --- Final Output
 *         (Primary Diagonal Sum) --- The sum of the primary diagonal is: 15
 *         -------------------------------------------
 */
public class Q05_DiagonalSum {

	public static int diagonalSum(int arr[][]) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i][i];
		}

		return sum;
	}

	public static int[][] takeInput(Scanner sc) {
		System.out.println("Enter the size of the square matrix(n):");
		int n = sc.nextInt();

		int input[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter element at Row " + i + ", Column " + j + ":");
				input[i][j] = sc.nextInt();
			}
		}

		return input;
	}

	public static void printArray(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][] = takeInput(sc);

		System.out.println("\n--- Displaying 2D Array Elements ---");
		printArray(arr);

		System.out.println("\n--- Final Output(Primary Diagonal Sum) ---");
		System.out.println("The Sum of the primary diagonal is: " + diagonalSum(arr));

		sc.close();
	}

}
