package pkg05_arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


/**
 * @author SUDHIR
 * Question: Remove Duplicate Elements from an Unsorted Array using Different Set Implementations
 * 
 * Description:
 * This program demonstrates removing duplicates from an unsorted integer array 
 * using three different Set approaches:
 * 1. HashSet       - Fast removal (Order is random/unordered).
 * 2. TreeSet       - Removes duplicates and sorts elements in Ascending Order.
 * 3. LinkedHashSet - Removes duplicates while preserving the Original Insertion Order.
 * 
 * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter the array size: 6
 * Enter elements: 35, 12, 35, 10, 12, 1
 * 
 * --- INPUT ARRAY ---
 * The array elements are: [ 35 12 35 10 12 1 ]
 * 
 * --- OUTPUT DATA ---
 * --- By Using HashSet ---
 * Array after removing duplicates(using HashSet): [ 1 35 10 12 ]
 * 
 * --- By Using TreeSet ---
 * Array after removing duplicates(using TreeSet): [ 1 10 12 35 ]
 * 
 * --- By Using LinkedHashSet ---
 * Array after removing duplicate(using LinkedHashSet): [ 35 12 10 1 ]
 * -------------------------------------------
 */
public class Q14_B_RemoveDuplicateElementsFromUnsortedArray {
    // Using HashSet
	public static int[] removeDuplicates1(int arr[]) {
		Set<Integer> set = new HashSet<>();
		
		for(int num : arr) {
			set.add(num);
		}
		
		int result[] = new int[set.size()];
		int index = 0;
		
		for(int num : set) {
			result[index++] = num;
		}
		
		return result;
	}
	
	// Using TreeSet
	public static int[] removeDuplicates2(int arr[]) {
		Set<Integer> set = new TreeSet<>();
		
		for(int num : arr) {
			set.add(num);
		}
		
		int result[] = new int[set.size()];
		int index = 0;
		
		for(int num : set) {
			result[index++] = num;
		}
		
		return result;
	}
	
	//Using LinkedHashSet
	public static int[] removeDuplicates3(int arr[]) {
		Set<Integer> set = new LinkedHashSet<>();
		
		for(int num : arr) {
			set.add(num);
		}
		
		int result[] = new int[set.size()];
		int index = 0;
		
		for(int num : set) {
			result[index++] = num;
		}
		
		return result;
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
		
		System.out.println("\n--- INPUT ARRAY ---");
		printArray(arr);
		
		
		System.out.println("\n--- OUTPUT DATA ---");
		
		int result1[] = removeDuplicates1(arr);	
		System.out.println("\n--- By Using HashSet ---");
		System.out.println("Unique elements count: " + result1.length);
		System.out.print("Array after removing duplicates(using HashSet): ");
		printArray(result1);
		
		int result2[] = removeDuplicates2(arr);
		System.out.println("\n--- By Using TreeSet ---");
		System.out.println("Unique elements count: " + result2.length);
		System.out.print("Array after removing duplicates(using TreeSet): ");
		printArray(result2);
		
		int result3[] = removeDuplicates3(arr);
		System.out.println("\n--- By Using LinkedHashSet ---");
		System.out.println("Unique elements count: " + result3.length);
		System.out.print("Array after removing duplicate(using LinkedHashSet): ");
		printArray(result3);
		
		sc.close();	
	}

}
