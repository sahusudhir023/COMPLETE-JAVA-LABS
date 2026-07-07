package pkg03_logical_questions;

import java.util.Scanner;

public class Q09_DecimalToBinary {
    
	/**
	 * @author SUDHIR
	 * Question: Decimal To Binary Conversion
	 * Description: This program takes a decimal (base 10) integer as input 
	 * and converts it into its equivalent binary (base 2) representation.
	 * * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 12
	 * Output: 
	 * Enter the number(n): 12
	 * The binary equivalent of decimal 12 is: 1100
	 * </pre>
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter  the number(n):");
		int n = s.nextInt();
		
		if(n < 0) {
			System.out.println("Please enter the valid positive number.");
			s.close();
			return;
		}
		
		if(n == 0) {
			System.out.println("The binary equivalent of decimal 0 is: 0");
			s.close();
			return;
		}
		
		int originalNum = n;
		long ans = 0;
		long placeValue = 1;
		
		while(n > 0) {
			int rem = n % 2;
			ans = ans + (placeValue * rem);
			n = n/2;
			placeValue = placeValue * 10;
		}
		
		System.out.println("The binary equivalent of decimal " + originalNum + " is: " + ans);
		
		s.close();

	}

}
