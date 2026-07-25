package pkg06_2d_arrays;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Find the Largest Diagonal Sum
 * * Description: 
 * This program calculates the sums of both the Primary and Secondary diagonals 
 * of a square matrix and identifies the largest sum among the two.
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter the size of the square matrix: 3
 * (Input elements 1-9)
 * * SAMPLE OUTPUT:
 * * --- Displaying 2D Array Elements ---
 * 1 2 3 
 * 4 5 6 
 * 7 8 9 
 * * --- Final Output (Largest Diagonal Sum) ---
 * Primary Diagonal Sum: 15
 * Secondary Diagonal Sum: 15
 * The largest diagonal sum is: 15
 * -------------------------------------------
 */
public class Q06_LargestDiagonalSum {
	
	public static int largestDiagonalSum(int arr[][]) {
		int n = arr.length;
		int primarySum = 0;
		int secondarySum = 0;
		
		for(int i=0; i<n; i++) {
			primarySum = primarySum + arr[i][i];
			
			secondarySum = secondarySum + arr[i][n-1-i];
		}
		
		System.out.println("Primary Diagonal Sum: " + primarySum);
		System.out.println("Secodary Diagonal Sum: " + secondarySum);
		
		return Math.max(primarySum, secondarySum);
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
		
		System.out.println("\n--- Final Output(Largest Diagonal Sum) ---");
		System.out.println("The largest diagonal sum is: " + largestDiagonalSum(arr));
		
		sc.close();
	}

}
