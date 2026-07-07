package pkg03_logical_questions;

import java.util.Scanner;

public class Q08_BinaryToDecimal {
    
	/**
	 * @author SUDHIR
	 * Question: Binary To Decimal Conversion
	 * Description: This program takes a binary number (composed of only 0s and 1s) 
	 * as input and converts it into its equivalent decimal (base 10) number.
	 * 
	 * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 110
	 * Output: 
	 * Enter the binary number (0s and 1s): 110
	 * The decimal equivalent of binary 110 is: 6
	 * </pre>
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the binary number(0s and 1s):");
		int n = s.nextInt();
		
		if(n < 0) {
			System.out.println("Please enter the valid positive binary nummber.");
			s.close();
			return;
		}
		
		int originalNum = n;
		int ans = 0;
		int placeValue = 1;
		
		while(n > 0) {
			int lastDigit = n % 10;
			
			if( lastDigit != 0 && lastDigit != 1) {
				System.out.println("Invalid Binary Number, Contains digit other than 0 & 1.");
				s.close();
				return;
			}
			
			n = n /10;
			
			ans = ans + (placeValue * lastDigit);
			
			placeValue *= 2;
		}
		
		System.out.println("The decimal equivalent of binary " + originalNum + " is: " + ans);
		
		s.close();

	}

}
