package pkg03_logical_questions;

import java.util.Scanner;

public class Q10_SquareRoot_Integral {

	/**
	 * @author SUDHIR
	 * Question: Integral Part of Square Root
	 * Description: This program finds the floor/integral part of the square root 
	 * of a given number n without using any built-in Math functions.
	 * * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 10
	 * Output: 
	 * Enter the number(n): 10
	 * The integral square root is: 3
	 * (Since 3*3 = 9 is <= 10, but 4*4 = 16 is > 10)
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
		
		long output = 0;
		while(output*output <= n) {
			output = output + 1;
		}
		
		output = output -1;
		System.out.println("The integral square root of " + n + " is : " + output);
		
		s.close();

	}

}
