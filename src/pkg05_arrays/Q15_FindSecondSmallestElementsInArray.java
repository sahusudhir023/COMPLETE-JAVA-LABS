package pkg05_arrays;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Find Second Smallest Element in an Unsorted Array
 * 
 * Description: 
 * This program finds the second smallest distinct element in an unsorted 
 * integer array using a single-pass loop approach without sorting the array.
 * 
 * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter the array size: 6
 * Enter elements: 12, 35, 1, 10, 34, 1
 * 
 * --- INPUT ARRAY ---
 * The array elements are: [ 12 35 1 10 34 1 ]
 * 
 * --- OUTPUT DATA ---
 * Second Smallest Element: 10
 * -------------------------------------------
 */
public class Q15_FindSecondSmallestElementsInArray {
	
	public static int findSecondSmallest(int arr[]) {
		if(arr.length < 2) {
			return Integer.MAX_VALUE;
		}
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
				
			}else if(arr[i] < secondSmallest && arr[i] != smallest) {
				secondSmallest = arr[i];
			}
		}
		
		return secondSmallest;
	}

	public static int[] takeInput(Scanner sc) {
		System.out.println("Enter the array size:");
		int size = sc.nextInt();
		
		int input[] = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the element at index " + i + ":");
			input[i] = sc.nextInt();
		}
		
		return input;
	}
	
	public static void printArray(int arr[]) {
		System.out.print("The array elements are: [");
		
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
		
		int secondSmallestElement = findSecondSmallest(arr);
		
		System.out.println("\n--- OUTPUT DATA ---");
		if(secondSmallestElement == Integer.MAX_VALUE) {
			System.out.println("No second smallest value elment found(Array size <2 OR all elements are equal).");
		}else {
			System.out.println("Second Smallest Element: " + secondSmallestElement);
		}
		
		sc.close();
	}

}
