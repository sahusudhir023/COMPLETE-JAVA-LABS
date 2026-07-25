package pkg05_arrays;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Calculate the Sum of Array Elements
 * Description: This program takes a dynamic array as input from the user and calculates 
 * the total sum of all its elements using a single-pass loop approach.
 * 
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter the array size:
 * 4
 * Enter the element at index 0:
 * 10
 * Enter the element at index 1:
 * 20
 * Enter the element at index 2:
 * 30
 * Enter the element at index 3:
 * 40
 * * SAMPLE OUTPUT:
 * * --- INPUT DATA ---
 * The array elements are: [ 10 20 30 40 ]
 * * --- FINAL OUTPUT ---
 * The sum of the array elements is: 100
 * -------------------------------------------
 */
public class Q04_ReturnArraySum {
	
	public static int sum(int arr[]) {
		int ans = 0;
		
		for(int i=0; i<arr.length; i++) {
			ans = ans + arr[i];
		}
		return ans;
	}

	public static int[] takeInput(Scanner s) {
		System.out.println("Enter the array size:");
		int size = s.nextInt();

		int input[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element at index " + i + ":" + " ");
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void printArray(int arr[]) {
		System.out.print("The array elements are: [ ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("]");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int arr[] = takeInput(s);
		
		System.out.println("\n--- INPUT DATA ---");
		printArray(arr);
		
		System.out.println("\n--- FINAL OUTPUT ---");
		System.out.println("The sum of the array elements is: " + sum(arr));
		
		s.close();

	}

}
