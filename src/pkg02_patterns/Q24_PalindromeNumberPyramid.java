package pkg02_patterns;

import java.util.Scanner;

public class Q24_PalindromeNumberPyramid {
    
	/**
	 * @author SUDHIR
	 * Question: Palindrome Number Pyramid Pattern
	 * Description: This program takes an integer n and prints a centered pyramid where 
	 * numbers increase from 1 to the row number, and then decrease back to 1.
	 * 
	 * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 4
	 * Output:
	 *       1 
	 *     1 2 1 
	 *   1 2 3 2 1 
	 * 1 2 3 4 3 2 1 
	 * </pre>
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i represents the current row
		while(i <= n) {
			int space = 1;
			
			while(space <= (n-i)) {
				System.out.print("  ");
				space++;
			}
			
			int j = 1; // j represents the current column
			while(j <= i) {
				System.out.print(j + " ");
				j++;
			}
			
			int startingNumber = (i - 1);
			while(startingNumber >= 1) {
				System.out.print(startingNumber + " ");
				startingNumber--;
				
			}
			System.out.println();
			i++;
		}
		s.close();

	}

}
