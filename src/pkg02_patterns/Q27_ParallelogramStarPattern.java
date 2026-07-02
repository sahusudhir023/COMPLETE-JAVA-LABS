package pkg02_patterns;

import java.util.Scanner;

public class Q27_ParallelogramStarPattern {
    
	/**
	 * @author SUDHIR
	 * Question: Right-Leaning Star Parallelogram Pattern
	 * Description: This program takes an integer n and prints a parallelogram pattern 
	 * of stars, where each subsequent row shifts to the right by adding leading spaces.
	 * * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 4
	 * Output:
	 * * * * * 
	 *   * * * *
	 *     * * * * 
	 *      * * * * 
	 * </pre>
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int i = 1;  // i represents the current row
		while(i <= n) {
			int space = 1;
			
			while(space <= (i-1)) {
				System.out.print("  ");
				space++;
			}
			
			int j = 1;  // j represents the current column
			while(j <= n) {
				System.out.print("* ");
				j++;
			}
			
			System.out.println();
			i++;
		}
		s.close();

	}

}
