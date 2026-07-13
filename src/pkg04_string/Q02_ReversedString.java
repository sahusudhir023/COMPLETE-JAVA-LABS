package pkg04_string;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Reverse a String
 * * Description: 
 * This program takes a string input from the user and reverses it using a backward 
 * loop. It uses StringBuilder for memory efficiency (O(1) auxiliary chunk creation) 
 * instead of regular String concatenation.
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter the words:
 * SUDHIR
 * * --- INPUT DATA ---
 * Original string are: SUDHIR
 * * --- OUTPUT DATA ---
 * Reversed string are: RIHDUS
 * -------------------------------------------
 */
public class Q02_ReversedString {

	public static String reverseString(String str) {
		StringBuilder reversed = new StringBuilder();
		
		for(int i=str.length()-1; i>=0; i--) {
			reversed.append(str.charAt(i));
		}
		
		return reversed.toString();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the words:");
		String str = sc.nextLine();
		
		System.out.println("\n--- INPUT DATA ---");
		System.out.println("Original string are: " + str);
		
		System.out.println("\n--- OUTPUT DATA ---");
		System.out.println("Reversed string are: " + reverseString(str));
		
		sc.close();

	}

}
