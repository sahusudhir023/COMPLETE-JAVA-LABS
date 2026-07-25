package pkg05_arrays;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Array Input and Dynamic Memory Allocation
 * Description: This program demonstrates how to take dynamic input for an array 
 * from the user, allocate memory at runtime, and print the array elements using modular methods.
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter the array size:
 * 5
 * Enter the element at index 0:
 * 12
 * Enter the element at index 1:
 * 65
 * Enter the element at index 2:
 * 7
 * Enter the element at index 3:
 * 98
 * Enter the element at index 4:
 * 23
 * * SAMPLE OUTPUT:
 * The array elements are: [ 12 65 7 98 23 ]
 */

public class Q01_TakingInputAndPrint {
	
	// Method to take dynamic array input from the user
	public static int[] takeInput(Scanner s) {	
		System.out.println("Enter the array size:");
		int size = s.nextInt();
		
		int input[] = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the element at index " + i + ":");
			input[i] = s.nextInt();
		}
		return input;
	}
	
	// Method to print the elements of the array
	public static void printArray(int arr[]) {
		System.out.print("The array elements are: [ ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("]");
	}
	
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		
		int arr[] = takeInput(s);
		
		printArray(arr);
		
		s.close();

	}

}
