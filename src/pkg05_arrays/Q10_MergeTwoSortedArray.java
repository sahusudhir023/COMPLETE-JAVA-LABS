package pkg05_arrays;

import java.util.Scanner;

/**
 * @author SUDHIR
 * Question: Merge Two Sorted Arrays
 * * Description: 
 * This program takes two pre-sorted dynamic arrays as input from the user and merges 
 * them into a single sorted array using the highly optimized Two-Pointer technique 
 * in a single pass.
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * --- Enter the first array elements ---
 * Enter the array size:
 * 3
 * Please enter the sorted array:
 * Enter the element at index 0: 
 * 10
 * Enter the element at index 1: 
 * 30
 * Enter the element at index 2: 
 * 50
 * * --- Enter the second array elements ---
 * Enter the array size:
 * 2
 * Please enter the sorted array:
 * Enter the element at index 0: 
 * 20
 * Enter the element at index 1: 
 * 40
 * * --- INPUT DATA ---
 * --- First array elements ---
 * The array elements are: [ 10 30 50 ]
 * --- Second array elements ---
 * The array elements are: [ 20 40 ]
 * * SAMPLE OUTPUT:
 * --- FINAL OUTPUT ---
 * --- MERGED SORTED ARRAY ---
 * The array elements are: [ 10 20 30 40 50 ]
 * -------------------------------------------
 */
public class Q10_MergeTwoSortedArray {
	
	public static int[] mergeArray(int arr1[], int arr2[]) {
		int i = 0;  // Index pointer for arr1
		int j = 0;  // Index pointer for arr2
		int k = 0;  // Index pointer for ansArray
		
		int ansArray[] = new int[arr1.length + arr2.length];
		
		while(i <arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				ansArray[k] = arr1[i];	
				i++;
			}else {
				ansArray[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i < arr1.length) {
			ansArray[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j <arr2.length) {
			ansArray[k] = arr2[j];
			j++;
			k++;
		}
		
		return ansArray;
		
	}

	public static int[] takeInput(Scanner sc) {
		System.out.println("Enter the array size:");
		int size = sc.nextInt();
		
		int input[] = new int[size];
		System.out.println("Please enter the sorted array:");
		
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
		
		System.out.println("\n--- Enter the first array elements ---");
		int arr1[] = takeInput(sc);
		
		System.out.println("\n--- Enter the second array elements ---");
		int arr2[] = takeInput(sc);
		
		System.out.println("\n--- INPUT DATA ---");
		System.out.println("--- First array elements ---");
		printArray(arr1);
		
		System.out.println("--- Second array elements ---");
		printArray(arr2);
		
		int mergedArray[] = mergeArray(arr1, arr2);
		
		System.out.println("\n--- FINAL OUTPUT ---");
		System.out.println("--- MERGE ARRAY ---");
		printArray(mergedArray);
		
		sc.close();
	}

}
