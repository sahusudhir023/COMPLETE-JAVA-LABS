package pkg04_string;

import java.util.Scanner;


/**
 * @author SUDHIR
 * @version 1.0
 * * Question: Print All Substrings of a String
 * * Description:
 * This program finds and prints all possible substrings of a given string.
 * It uses nested loops where the outer loop fixes the starting points and 
 * the inner loop determines the ending points, utilizing the built-in substring() method.
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * abc
 * * SAMPLE OUTPUT:
 * a
 * ab
 * abc
 * * b
 * bc
 * * c
 * -------------------------------------------
 */
public class Q05_A_PrintAllSubstrings {

	public static void printSubstrings(String str) {
		for(int start=0; start<str.length(); start++) {
			
			for(int end=start; end<str.length(); end++) {
				System.out.println(str.substring(start, end+1));
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
		printSubstrings(str);
		
		sc.close();
	}

}
