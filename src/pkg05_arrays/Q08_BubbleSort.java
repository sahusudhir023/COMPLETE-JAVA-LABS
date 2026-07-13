package pkg05_arrays;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Bubble Sort Algorithm
 * * Description: 
 * This program takes an unsorted dynamic array from the user and sorts it in ascending 
 * order using the Bubble Sort algorithm. It repeatedly steps through the list, compares 
 * adjacent elements, and swaps them if they are in the wrong order.
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter the array size:
 * 5
 * Enter the element at index 0:
 * 5
 * Enter the element at index 1:
 * 1
 * Enter the element at index 2:
 * 4
 * Enter the element at index 3:
 * 2
 * Enter the element at index 4:
 * 8
 * * --- ORIGINAL ARRAY ---
 * The array elements are: [ 5 1 4 2 8 ]
 * * SAMPLE OUTPUT:
 * --- FINAL OUTPUT ---
 * --- SORTED ARRAY ---
 * The array elements are: [ 1 2 4 5 8 ]
 * -------------------------------------------
 */
public class Q08_BubbleSort {
	
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
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
		
		System.out.println("\n--- SORTED ARRAY ---");
		bubbleSort(arr);
		printArray(arr);
		
		sc.close();
	}

}
