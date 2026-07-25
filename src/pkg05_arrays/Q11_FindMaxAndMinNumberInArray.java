package pkg05_arrays;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Find Maximum and Minimum Number in an Array
 * * Description: 
 * This program takes an integer array input from the user and finds both the maximum 
 * and minimum numbers using a single loop traversal. It uses modular helper methods 
 * for array input, array printing, and finding max/min values for clean code architecture.
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter array size:
 * 5
 * Enter the element at index 0: 15
 * Enter the element at index 1: 42
 * Enter the element at index 2: 7
 * Enter the element at index 3: 89
 * Enter the element at index 4: 3
 * * --- INPUT ARRAY ---
 * The given array elements are: [ 15 42 7 89 3 ]
 * * --- OUTPUT DATA ---
 * Maximum number in given array: 89
 * Minimum number in given array: 3
 * -------------------------------------------
 */
public class Q11_FindMaxAndMinNumberInArray {
	
	public static void findMaxAndMin(int arr[]) {
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Maximum number in given array: " + max);
		System.out.println("Minimum number in given array: " + min);
	}

	public static int[] takeInput(Scanner sc) {
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		
		int input[] = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the element at index " + i + ":");
			input[i] = sc.nextInt();
		}
		
		return input;
	}
	
	public static void printArray(int arr[]) {
		System.out.print("The given array elements are: [ ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = takeInput(sc);
		
		System.out.println("\n--- INPUT ARRAY ---");
	    printArray(arr);
	    
	    System.out.println("\n--- OUTPUT DATA ---");
	    findMaxAndMin(arr);
		
	    sc.close();
	}

}
