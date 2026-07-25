package pkg05_arrays;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Selection Sort Algorithm
 * * Description: This program takes an unsorted dynamic array from the user and sorts it in ascending 
 * order using the Selection Sort algorithm. It repeatedly finds the minimum element 
 * from the unsorted part and puts it at the beginning.
 *
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter the array size:
 * 5
 * Enter the element at index 0:
 * 29
 * Enter the element at index 1:
 * 10
 * Enter the element at index 2:
 * 14
 * Enter the element at index 3:
 * 37
 * Enter the element at index 4:
 * 13
 * * --- ORIGINAL ARRAY ---
 * The array elements are: [ 29 10 14 37 13 ]
 * * SAMPLE OUTPUT:
 * --- FINAL OUTPUT ---
 * --- SORTED ARRAY ---
 * The array elements are: [ 10 13 14 29 37 ]
 * -------------------------------------------
 */
public class Q07_SelectionSort {
	
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			int minElement = arr[i];
			int minIndex = i;
			
			for(int j=i+1; j<n; j++) {
				if(arr[j] < minElement) {
					minElement = arr[j];
					minIndex = j;
				}
			}
			
			if(minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = minElement;
			}
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
		System.out.print("The array elements are: [ ");
		
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
		
		selectionSort(arr);
		System.out.println("\n--- SORTED ARRAY ---");
		printArray(arr);
		
	   sc.close();
	}

}
