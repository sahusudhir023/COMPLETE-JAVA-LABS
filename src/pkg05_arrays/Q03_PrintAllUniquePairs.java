package pkg05_arrays;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Print All Unique Pairs in an Array
 * Description: This program takes a dynamic array as input from the user and prints all possible 
 * unique pairs of elements using a nested loop approach.
 * 
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter the array size:
 * 4
 * Enter the element at index 0:
 * 1
 * Enter the element at index 1:
 * 2
 * Enter the element at index 2:
 * 3
 * Enter the element at index 3:
 * 4
 * * SAMPLE OUTPUT:
 * * --- INPUT DATA ---
 * The array elements are: [ 1 2 3 4 ]
 * * --- GENERATED PAIRS ---
 * (1,2)(1,3)(1,4)
 * (2,3)(2,4)
 * (3,4)
 * -------------------------------------------
 */
public class Q03_PrintAllUniquePairs {
	
	public static void printAllPairs(int arr[]) {	
		for(int i=0; i<(arr.length-1); i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				System.out.print("(" + arr[i] + "," + arr[j] + ")");
			}
			
			System.out.println();
		}
	}

	public static int[] takeInput(Scanner s) {
		System.out.println("Enter the array size:");
		int size = s.nextInt();

		int input[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element at index " + i + ":" +" ");
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
		
		System.out.println("\n--- GENERATED PAIRS ---");
		printAllPairs(arr);
		
		s.close();

	}

}
