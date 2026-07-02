package pkg02_patterns;

import java.util.Scanner;

public class Q26_StarDiamondPattern {
	
	/**
	 * @author SUDHIR
	 * Question: Star Diamond Pattern
	 * Description: This program takes an integer n and prints a full centered diamond 
	 * pattern of stars, consisting of an upper pyramid and a lower inverted pyramid.
	 * * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 5
	 * Output:
	 *     *
	 *   * * *
	 * * * * * *  
	 *   * * *
	 *     * 
	 * </pre>
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int n1 = (n+1)/2;  // First half number of rows
		int n2 = n/2;     // Second half number of rows
		
		// --- FIRST HALF (Upper Pyramid) ---
		int i = 1;  // i represents the current row first half
		while(i <= n1) {
			int space = 1;
			
			while(space <= (n1-i)) {
				System.out.print("  ");
				space++;
			}
			
			int j = 1;  // j represents the current column first half
			while(j <= (2*i - 1)) {
				System.out.print("* ");
				j++;
			}
			
			System.out.println();
			i++;
		}
		
		// --- SECOND HALF (Lower Inverted Pyramid) ---
		i = n2;  // i represents the current row second half
		while(i >= 1) {
			int space = 1;
			
			while(space <= (n1-i)) {
				System.out.print("  ");
				space++;
			}
			
			int j = 1;  // j represents the current column second half
			while(j <= (2*i-1)) {
				System.out.print("* ");
				j++;
			}
			
			System.out.println();
			i--;
		}
		s.close();
	}

}
