package pkg02_patterns;

import java.util.Scanner;

public class Q29_MirrorImageOfHalfDiamondStarPattern {
	
	
	/**
	 * @author SUDHIR
	 * Question: Mirror Image Of Half Diamond Star Pattern
	 * Description: This program takes an odd integer n and prints a mirror image of a 
	 * half diamond pattern of stars. It uses spaces to push the stars to the right side,
	 * creating a sharp right-aligned diamond reflection.
	 * 
	 * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 7
	 * Output:
	 *             * 
	 *           * * 
	 *         * * * 
	 *       * * * * 
	 *         * * * 
	 *           * * 
	 *             * 
	 * </pre>
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int n1 = (n+1)/2;  // First half number of rows
		int n2 = n/2;      // Second half number of columns
		
		// --- FIRST HALF ---
		int i = 1;  // i represents the current row first half
		while(i <= n1) {
			int space = 1;
			
			while(space <= (n1-i)) {
				System.out.print("  ");
				space++;
			}
			
			int j = 1; // j represents the current column first half
			while(j <= i) {
				System.out.print("* ");
				j++;
			}
			
			System.out.println();
			i++;
		}
		// --- SECOND HALF ---
		i = n2;  // i represents the current row second half
		while(i >= 1) {
			int space = 1;
			
			while(space <= (n1 - i)) {
				System.out.print("  ");
				space++;
			}
			
			int j = 1;  // j represents the current column first half
			while(j <= i) {
				System.out.print("* ");
				j++;
			}
			
			System.out.println();
			i--;
		}
		s.close();
	}

}
