package pkg03_logical_questions;

import java.util.Scanner;

public class Q04_NthFibonacciNumber {
		
	/**
	 * @author SUDHIR
	 * Question: Find Nth Fibonacci Number (0-Indexed)
	 * Description: This program takes an integer n as input and returns
	 * the Fibonacci number at the Nth index (0th index = 0, 1st index = 1, etc.).
	 * * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 0
	 * Output: The 0th index Fibonacci number is: 0
	 * * Input: n = 3
	 * Output: The 3rd index Fibonacci number is: 2
	 * </pre>
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the index number(n):");
		int n = s.nextInt();
		
		if(n < 0) {
			System.out.println("Please enter a valid index (0 or greater).");
			s.close();
			return;
		}
		
		int a = 0;
		int b = 1;
		int c;
		for(int i=0; i<n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		
		String suffix = "th";
		if(n == 1) suffix = "st";
		else if(n == 2) suffix = "nd";
		else if(n == 3) suffix = "rd";
		
		System.out.println("The "+ n + suffix +" Fibonacci number are: "+ a);
		
		s.close();
	}

}
