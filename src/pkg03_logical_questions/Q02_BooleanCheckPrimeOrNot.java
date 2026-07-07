package pkg03_logical_questions;

import java.util.Scanner;

public class Q02_BooleanCheckPrimeOrNot {
	
	/**
	 * @author SUDHIR
	 * Question: Check Prime Number or Not (Boolean Check)
	 * Description: This program takes an integer n as input and checks whether 
	 * the number is prime or not by returning a boolean value (true/false).
	 * 
	 * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 7
	 * Output:
	 * Enter the integer number(n): 7
	 * 7 is a prime number. Status: true
	 * 
	 * Input: n = 4
	 * Output:
	 * Enter the integer number(n): 4
	 * 4 is not a prime number. Status: false
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

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the integer number(n):");
		int n = s.nextInt();
		
		boolean ansPrime = isPrime(n);
				
		if(ansPrime) {
			System.out.println(n + " is Prime number. Status: " + ansPrime);
		}else {
			System.out.println(n + " is Not Prime number. Status: " + ansPrime);
		}
		
		s.close();
		
	}

}
