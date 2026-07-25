package pkg05_arrays;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Find Second Largest Element in an Array
 * * Description: 
 * This program finds the second largest element in an integer array using a single-pass 
 * O(n) traversal without sorting the array. It properly handles duplicate elements 
 * and edge cases (like when all elements are identical or array size is less than 2).
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter array size:
 * 6
 * Enter the element at index 0: 12
 * Enter the element at index 1: 35
 * Enter the element at index 2: 1
 * Enter the element at index 3: 10
 * Enter the element at index 4: 34
 * Enter the element at index 5: 1
 * * --- INPUT ARRAY ---
 * The array elements are: [ 12 35 1 10 34 1 ]
 * * --- OUTPUT DATA ---
 * Second Largest Element: 34
 * -------------------------------------------
 */
public class Q12_FindSecondLargestElementInArray {

	public static int findSecondLargest(int arr[]) {
		if(arr.length < 2) {
			System.out.println("Array size must be at least 2.");
			return -1;
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
				
			}else if(arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		
		return secondLargest;
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
		System.out.print("The array elements are: [ ");
		
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
		System.out.println("Second Largest Element: " + findSecondLargest(arr));
		
        sc.close();
	}

}
