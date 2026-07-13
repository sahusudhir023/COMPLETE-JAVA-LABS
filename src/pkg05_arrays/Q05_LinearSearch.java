package pkg05_arrays;

import java.util.Scanner;

/**
 * @author SUDHIR
 * Question: Linear Search in an Array (Find Element Position)
 * * Description: 
 * This program takes a dynamic integer array and a target element as input from the user. 
 * It implements the Linear Search algorithm using a single-pass loop to find and return 
 * the 1-based position of the target element. If the element is not found, it returns -1.
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter the array size:
 * 5
 * Enter the element at index 0:
 * 15
 * Enter the element at index 1:
 * 25
 * Enter the element at index 2:
 * 35
 * Enter the element at index 3:
 * 45
 * Enter the element at index 4:
 * 55
 * * --- INPUT DATA ---
 * The array elements are: [ 15 25 35 45 55 ]
 * * Enter the element you want to search:
 * 45
 * * SAMPLE OUTPUT:
 * --- FINAL OUTPUT ---
 * Element 45 found at position: 4
 * -------------------------------------------
 */
public class Q05_LinearSearch {
	
	public static int linearSearch(int arr[], int k) {	
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == k) {
				return i+1;
			}
		}
		return -1;
	}
	
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
	
	public static void printArray(int arr[]) {
		System.out.print("The array elements are: [ ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(" ]");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		int arr[] = takeInput(s);
		
		System.out.println("\n--- INPUT DATA ---");
		printArray(arr);
		
		System.out.println("\nEnter the element you want to serach:");
		int target = s.nextInt();
		
		System.out.println("\n--- FINAL OUTPUT ---");	
	    int ansPosition = linearSearch(arr, target);
	    
	    if(ansPosition != -1) {
	    	System.out.println("Element " + target + " found at postion: " + ansPosition);
	    }else {
	    	System.out.println("Element " + target + " is not present in the array.");
	    }
	    
	    s.close();
	}
	

}
