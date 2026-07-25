package pkg06_2d_arrays;

import java.util.Scanner;

/**
 * @author SUDHIR Question: Find the Transpose of a 2D Array (Matrix) *
 *         Description: This program dynamically accepts a matrix from the user,
 *         swaps its rows and columns, and displays the resulting transposed
 *         matrix. * Sample Input/Output Example:
 *         ------------------------------------------- SAMPLE INPUT: Enter the
 *         number of rows: 2 Enter the number of columns: 3 Enter matrix
 *         elements: [1, 2, 3] and [4, 5, 6] * SAMPLE OUTPUT: * --- Displaying
 *         2D Array Elements --- 1 2 3 4 5 6 * --- Final Output (Transposed
 *         Matrix) --- 1 4 2 5 3 6 -------------------------------------------
 */
public class Q04_TransposeMatrix {

	public static int[][] transposeMatrix(int arr[][]) {
		int rows = arr.length;
		int cols = arr[0].length;

		int trans[][] = new int[cols][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				trans[j][i] = arr[i][j];
			}
		}

		return trans;
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

		int transposedArray[][] = transposeMatrix(arr);
		System.out.println("\n--- Final Output (Transposed Matrix) ---");
		printArray(transposedArray);

		sc.close();
	}

}
