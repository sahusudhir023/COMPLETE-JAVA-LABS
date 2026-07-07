package pkg03_logical_questions;

import java.util.Scanner;

public class Q01_PrintNaturalNumber1ToN {

	/**
	 * @author SUDHIR
	 * Question: Print Natural Numbers From 1 to N
	 * Description: This program takes an integer n as input and prints all 
	 * the natural numbers starting from 1 up to n in a single line.
	 * 
	 * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 5
	 * Output:
	 * Enter the integer number(n): 5
	 * Natural numbers from 1 to 5 are:
	 * 1 2 3 4 5 
	 * </pre>
	 */
	public static void printTillN(int n) {
		
		if(n <= 0) {
			return;
		}
		
		for(int i=1; i<=n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the integer number(n):");
		int n = s.nextInt();
		
		if(n > 0) {
			System.out.println("Natural number from 1 to " + n + " are: ");
		}
		printTillN(n);
		
		s.close();
	}

}
