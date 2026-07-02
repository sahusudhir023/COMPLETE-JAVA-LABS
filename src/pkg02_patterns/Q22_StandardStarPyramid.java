package pkg02_patterns;

import java.util.Scanner;

public class Q22_StandardStarPyramid {
    
	/**
	 * @author SUDHIR
	 * Question: Standard Star Pyramid Pattern
	 * Description: This program takes an integer n and prints a full centered pyramid 
	 * pattern of stars using only two loops by applying the formula (2 * i - 1).
	 * 
	 * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 4
	 * Output:
	 *       * 
	 *     * * * 
	 *   * * * * * 
	 * * * * * * * * 
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
			// Optimized logic: Using (2 * i - 1) formula to print odd number of stars in a single loop.
			 while(j <= ((2*i)-1)) {
				 System.out.print("* ");
				 j++;
			 }
			 
			 System.out.println();
			 i++;
		 }
		 s.close();      
	}

}
