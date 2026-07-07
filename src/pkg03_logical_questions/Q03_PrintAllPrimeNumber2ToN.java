package pkg03_logical_questions;

import java.util.Scanner;

public class Q03_PrintAllPrimeNumber2ToN {
	
	/**
	 * @author SUDHIR
	 * Question: Print All Prime Numbers From 2 to N
	 * Description: This program takes an integer n as input and prints all 
	 * the prime numbers between 2 and n (inclusive) by reusing the isPrime logic.
	 * 
	 * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 10
	 * Output:
	 * Enter the integer number(n): 10
	 * Prime numbers from 2 to 10 are:
	 * 2 3 5 7 
	 * </pre>
	 */
	public static boolean isPrime(int n) {
		
		if(n <= 1) {
			return false;
		}
		
		int divisor = 2;
		while(divisor < n) {
			if(n%divisor == 0) {
				return false;
			}
			divisor++;
		}
		return true;
	}
	
	public static void printPrime(int n) {
		
		if(n < 2) {
			return;
		}
		
		for(int i=2; i<=n; i++) {
			boolean isIPrime = isPrime(i);
			
			if(isIPrime) {
				System.out.print(i +" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the integer number(n):");
		int n = s.nextInt();
		
		if(n >= 2) {
			System.out.println("Prime number from 2 to " + n + " are:");
		}else {
			System.out.println("There are no prime numbers in the given range.");
		}
		
		printPrime(n);
		
		s.close();
		
	}

}
