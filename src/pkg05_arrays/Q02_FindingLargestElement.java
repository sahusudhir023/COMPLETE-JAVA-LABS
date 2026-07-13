package pkg05_arrays;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Find the Largest Element in an Array
 * * Description: 
 * This program takes a dynamic array as input from the user and finds the 
 * maximum/largest element using the Integer.MIN_VALUE initialization technique.
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
 * * --- INPUT DATA ---
 * The array elements are: [ 12 65 7 98 23 ]
 * * --- FINAL OUTPUT ---
 * The largest element in the given array is: 98
 * -------------------------------------------
 */
public class Q02_FindingLargestElement {
	
	//This method is finding the largest element
	public static int largestElementInArray(int arr[]) {
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

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
			System.out.print(arr[i] +" ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		
		int arr[] = takeInput(s);
		
		System.out.println("\n--- INPUT DATA ---");
		printArray(arr);
		
		System.out.println("\n--- FINAL OUTPUT ---");
		System.out.println("The largest element in given array are: " + largestElementInArray(arr));
		
		s.close();
	}

}
