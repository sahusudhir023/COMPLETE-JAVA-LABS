package pkg06_2d_arrays;

import java.util.Scanner;

/**
 * @author SUDHIR 
 * Question: Take Input and Print a 2D Array 
 * Description: This program takes the number of rows, columns, and elements of a 2D array
 *              dynamically from the user using Scanner and prints the matrix in a
 *              clean grid format. 
 *         
 *         * Sample Input/Output Example:
 *         ------------------------------------------- 
 *         SAMPLE INPUT: 
 *         Enter the number of rows: 2 
 *         Enter the number of columns: 3 
 *         Enter element at 0 row 0 column 10         
 *         Enter element at 0 row 1 column 20 
 *         Enter element at 0 row 2 column 30 
 *         Enter element at 1 row 0 column 40 
 *         Enter element at 1 row 1 column 50        
 *         Enter element at 1 row 2 column 60 
 *         
 *         * SAMPLE OUTPUT: *
 *         --- The 2D-Array elements are: ---
 *          10 20 30 
 *          40 50 60
 *         -------------------------------------------
 */
public class Q01_TakingInputAndPrint {

	public static int[][] takeInput(Scanner sc) {
		System.out.println("Enter the number of rows:");
		int row = sc.nextInt();

		System.out.println("Enter the number of columns:");
		int cols = sc.nextInt();

		int input[][] = new int[row][cols];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Enter element at Row " + i + ", Column " + j + ": ");
				input[i][j] = sc.nextInt();
			}
		}

		return input;
	}

	public static void printArray(int arr[][]) {
		int row = arr.length;
		int cols = arr[0].length;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
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

		sc.close();
	}

}
