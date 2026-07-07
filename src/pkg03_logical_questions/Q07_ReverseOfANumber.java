package pkg03_logical_questions;

import java.util.Scanner;

public class Q07_ReverseOfANumber {

	/* @author SUDHIR
	 * Question: Reverse of a Number
	 * Description: This program takes an integer n as input and reverses its digits.
	 * It also handles the edge case for negative numbers.
	 * 
	 * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 1234
	 * Output: 
	 * Enter the number(n): 1234
	 * The reversed number is: 4321
	 * </pre>
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number(n):");
		int n = s.nextInt();
		
		if(n < 0) {
			System.out.println("Please enter the valid positive number.");
			s.close();
			return;
		}
		
		int originalNum = n;
		int revNum = 0;
		
		while(n > 0) {
			int lastDigit = n % 10;
			n = n/10;
			revNum = (revNum * 10) + lastDigit;
		}
		
		System.out.println("The reverse number of " + originalNum + " is: " + revNum);
		
		s.close();
	}

}
