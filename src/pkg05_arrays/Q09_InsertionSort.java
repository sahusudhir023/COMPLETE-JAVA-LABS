package pkg05_arrays;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Insertion Sort Algorithm
 * * Description: 
 * This program takes an unsorted dynamic array from the user and sorts it in ascending 
 * order using the Insertion Sort algorithm. It virtually splits the array into a sorted 
 * and an unsorted part, then picks elements from the unsorted part and inserts them 
 * into their correct position in the sorted part by shifting larger elements.
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter the array size:
 * 5
 * Enter the element at index 0:
 * 12
 * Enter the element at index 1:
 * 11
 * Enter the element at index 2:
 * 13
 * Enter the element at index 3:
 * 5
 * Enter the element at index 4:
 * 6
 * * --- ORIGINAL ARRAY ---
 * The array elements are: [ 12 11 13 5 6 ]
 * * SAMPLE OUTPUT:
 * --- FINAL OUTPUT ---
 * --- SORTED ARRAY ---
 * The array elements are: [ 5 6 11 12 13 ]
 * -------------------------------------------
 */
public class Q09_InsertionSort {
	
	public static void insertionSort(int arr[]) {
		int n = arr.length;
		
		for(int i=1; i<n; i++) {
			int j = i-1;
			int temp = arr[i];
			
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				
				j--;
			}
			
			arr[j+1] = temp;
		}
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
		System.out.print("The array elements are : [ ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = takeInput(sc);
		
		System.out.println("\n--- ORIGINAL ARRAY ---");
		printArray(arr);
		
		System.out.println("\n--- SORTED ARRAY ---");
		insertionSort(arr);
		printArray(arr);
		
        sc.close();
	}

}
