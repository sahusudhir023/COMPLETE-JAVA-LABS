package pkg04_string;

import java.util.Scanner;


/**
 * @author SUDHIR
 * * Question: Print All Substrings of a String (Length-Based Approach)
 * * Description:
 * This program finds and prints all possible substrings of a given string.
 * It uses a length-based sliding window approach, where the outer loop fixes 
 * the length of the substring (from 1 to n) and the inner loop slides the window 
 * from the start index to the maximum possible starting position.
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * abc
 * * SAMPLE OUTPUT:
 * a
 * b
 * c
 * * ab
 * bc
 * * abc
 * -------------------------------------------
 */
public class Q05_B_PrintAllSubstrings {
	
	public static void printAllSubstrings(String str) {
		int n = str.length();
		
		for(int length = 1; length<=n; length++) {
			
			for(int start=0; start<=n-length; start++) {
				int end = start + length -1;
				
				System.out.println(str.substring(start, end + 1));
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the words:");
		String str = sc.nextLine();
		
		System.out.println("\n--- Input word is: " + str);
		
		System.out.println("\n-- OUTPUT DATA SUBSTRING");
		printAllSubstrings(str);
		
		sc.close();

	}

}
