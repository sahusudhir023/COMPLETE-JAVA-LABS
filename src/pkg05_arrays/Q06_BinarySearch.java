package pkg05_arrays;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Binary Search in a Sorted Array
 * * Description: This program takes a dynamic sorted integer array and a target element as input from the user. 
 * It implements the Binary Search algorithm using a divide-and-conquer approach to find and return 
 * the 0-based index of the target element. If the element is not found, it returns -1.
 * 
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter the array size:
 * 5
 * * Please enter the elements of a sorted array:
 * Enter the element at index 0:
 * 10
 * Enter the element at index 1:
 * 20
 * Enter the element at index 2:
 * 30
 * Enter the element at index 3:
 * 40
 * Enter the element at index 4:
 * 50
 * * --- INPUT DATA ---
 * The array elements are: [ 10 20 30 40 50 ]
 * * Enter the element you want to search:
 * 40
 * * SAMPLE OUTPUT:
 * --- FINAL OUTPUT ---
 * Element 40 found at index: 3
 * -------------------------------------------
 */
public class Q06_BinarySearch {
	
	public static int binarySearch(int arr[], int element) {
		int startIndex = 0;
		int endIndex = arr.length-1;
		
		while(startIndex <= endIndex) {
			int midIndex = (startIndex + endIndex)/2;
			
			if(element == arr[midIndex]) {
				return midIndex;
				
			}else if(element > arr[midIndex]) {
				startIndex = midIndex + 1;
				
			}else {
				endIndex = midIndex -1;
			}
		}
		
		return -1;
	}

	public static int[] takeInput(Scanner sc) {
		System.out.println("Enter the array size:");
		int size = sc.nextInt();
		
		int input[] = new int[size];
		System.out.println("\\nPlease enter the elements of a sorted array:");
		
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
		
		System.out.println("\n--- INPUT DATA ---");
		printArray(arr);
		
		System.out.println("\nEnter the element you want to search:");
		int targetElement = sc.nextInt();
		
		System.out.println("\n--- FINAL OUTPUT ---");
		int resultIndex = binarySearch(arr, targetElement);
		
		if(resultIndex != -1) {
			System.out.println("Element " + targetElement + " found at index: " + resultIndex);
		}else {
			System.out.println("Element " + targetElement + " is not present in the array.");
		}
		
		sc.close();

	}

}
