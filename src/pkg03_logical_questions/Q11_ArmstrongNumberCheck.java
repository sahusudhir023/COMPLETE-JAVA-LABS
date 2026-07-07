package pkg03_logical_questions;

import java.util.Scanner;

public class Q11_ArmstrongNumberCheck {
	
	/**
	 * @author SUDHIR
	 * Question: Armstrong Number Check
	 * Description: This program checks whether a given integer n is an Armstrong number or not.
	 * An Armstrong number of digits 'k' is a number that is equal to the sum of its own digits 
	 * each raised to the power of 'k'.
	 * * <p><b>Example 1 (3 Digits):</b></p>
	 * <pre>
	 * Input: n = 153
	 * Output: True (Since 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153)
	 * </pre>
	 * * <p><b>Example 2 (4 Digits):</b></p>
	 * <pre>
	 * Input: n = 1634
	 * Output: True (Since 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634)
	 * </pre>
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number(n):");
		int n = s.nextInt();
		
		if(n < 0) {
			System.out.println("False");
			s.close();
			return;
		}
		
		// Step 1: Calculate the length (number of digits) of the number
		int n1 = n;
		int length = 0;
		while(n1 != 0) {
			length = length + 1;
			
			n1 = n1/10;
		}
		
		// Step 2: Calculate the sum of digits raised to the power of length
		int n2 = n;
		int arm = 0;
		while(n2 != 0) {
			int mul = 1;
			int rem = n2%10;
			
			for(int i=1; i<=length; i++) {
				mul = mul * rem;
			}
			
			arm = arm + mul;
			n2 = n2/10;
		}
		
		// Step 3: Final validation check
		if(arm == n) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		s.close();
	}

}
