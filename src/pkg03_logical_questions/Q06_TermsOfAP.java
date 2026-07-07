package pkg03_logical_questions;

import java.util.Scanner;

public class Q06_TermsOfAP {
	
	/**
	 * @author SUDHIR
	 * Question: Terms of Arithmetic Progression (AP)
	 * Description: This program prints the first x terms of the series (3 * n + 2)
	 * which are not multiples of 4.
	 * 
	 * <p><b>Example:</b></p>
	 * <pre>
	 * Input: x = 4
	 * Output:
	 * Enter the number(x): 4
	 * The first 4 terms of the AP are:
	 * 5 11 14 17 
	 * 
	 * Explanation: 
	 * For n=1, term = 5 (printed)
	 * For n=2, term = 8 (skipped as it is divisible by 4)
	 * For n=3, term = 11 (printed)
	 * For n=4, term = 14 (printed)
	 * For n=5, term = 17 (printed)
	 * </pre>
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number(x):");
		int x = s.nextInt();
		
		if(x <= 0) {
			System.out.println("Please enter the valid number greater than 0.");
			s.close();
			return;
		}
		
		System.out.println("The first " + x + " terms of the AP are:");
		
		int count = 0;
		int n = 1;
		while(count < x) {
			int term = (3*n) + 2;
			
			if(term % 4 != 0) {
				System.out.print(term + " ");
				count++;
			}
			
			n++;
		}
		
		System.out.println();
		
		s.close();
	}

}
