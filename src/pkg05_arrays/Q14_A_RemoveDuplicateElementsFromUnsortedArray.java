package pkg05_arrays;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Remove Duplicate Elements from an Unsorted Array
 * 
 * Description: 
 * This program removes duplicate elements from an unsorted integer array 
 * using pure Array manipulation and Nested Loops without using any Collection.
 * 
 * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter the array size: 7
 * Enter the element at index 0: 10
 * Enter the element at index 1: 20
 * Enter the element at index 2: 20
 * Enter the element at index 3: 30
 * Enter the element at index 4: 40
 * Enter the element at index 5: 40
 * Enter the element at index 6: 50
 * 
 * --- INPUT ARRAY ---
 * The array elements are: [ 10 20 20 30 40 40 50 ]
 * 
 * --- OUTPUT ARRAY ---
 * Unique elements count: 5
 * Array after removing duplicates: [ 10 20 30 40 50 ]
 * -------------------------------------------
 */
public class Q14_A_RemoveDuplicateElementsFromUnsortedArray {
    	
	public static int[] removeDuplicates(int arr[]) {
		int n = arr.length;
		if(n == 0) {
			return new int[0];
		}
		
		int temp[] = new int[n];
		int uniqueCount = 0;
		
		for(int i=0; i<n; i++) {
			boolean isDuplicate = false;
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate) {
				temp[uniqueCount] = arr[i];
				uniqueCount++;
			}
	    }
		
		int result[] = new int[uniqueCount];
		for(int i=0; i<uniqueCount; i++) {
			result[i] = temp[i];
		}
		
		return result;
	}
	
	// Input Helper Method
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
	
	// Print Helper Method
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
		
		int result[] = removeDuplicates(arr);
		System.out.println("\n--- OUTPUT DATA ---");
		System.out.println("Unqiue elements count: " + result.length);
		System.out.print("Array after removing duplicates: ");
		printArray(result);
		
		sc.close();
	}

}
