package pkg05_arrays;

import java.util.Scanner;

/**
 * @author SUDHIR
 * Question: Remove Duplicate Elements from a Sorted Array
 * Description: 
 * This program removes duplicate elements from a pre-sorted integer array in-place 
 * using the Two-Pointer technique.
 * * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter sorted array size:
 * 7
 * Enter the element at index 0: 10
 * Enter the element at index 1: 10
 * Enter the element at index 2: 20
 * Enter the element at index 3: 20
 * Enter the element at index 4: 30
 * Enter the element at index 5: 30
 * Enter the element at index 6: 40
 * * --- INPUT ARRAY ---
 * The given array elements are: [ 10 10 20 20 30 30 40 ]
 * * --- OUTPUT DATA ---
 * Unique elements count: 4
 * Array after removing duplicates: [ 10 20 30 40 ]
 * -------------------------------------------
 */
public class Q13_RemoveDuplicateElementsFromSortedArray {
	
	public static int removeDuplicate(int arr[]) {
		if(arr.length == 0) {
			return 0;
		}
		
		int j = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[j]) {
				j++;
				arr[j] = arr[i];
			}
		}
			
		return j + 1;
	}

	public static int[] takeInput(Scanner sc) {
		System.out.println("Enter the sorted array size:");
		int size = sc.nextInt();
		
		int input[] = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the element at index " + i + ":");
			input[i] = sc.nextInt(); 
		}
		
		return input;
	}
	
	public static void printArray(int arr[], int length) {
		System.out.print("The array elements are: [ ");
		
		for(int i=0; i<length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = takeInput(sc);
		
		System.out.println("\n--- INPUT ARRAY ---");
		printArray(arr, arr.length);
		
		int uniqueCount = removeDuplicate(arr);
		
		System.out.println("\n--- OUTPUT DATA ---");
		System.out.println("Unique elements count: " + uniqueCount);
		System.out.print("Array after removing duplicates: ");
		printArray(arr, uniqueCount);

	}

}
