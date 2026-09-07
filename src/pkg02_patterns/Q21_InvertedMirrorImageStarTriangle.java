package pkg02_patterns;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Inverted Mirror Image Star Triangle Pattern
 * Description: This program takes an integer n and prints an inverted right-angled 
 * triangle of stars aligned to the right, with leading spaces increasing row by row.[cite: 3]
 * 
 * <p><b>Example:</b></p>
 * <pre>
 * Input: n = 4
 * Output:
 * * * * * 
 *   * * * 
 *     * * 
 *       * 
 * </pre>
 */
public class Q21_InvertedMirrorImageStarTriangle {
    
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i represents the current row
		while(i <= n) {
			int space = 1;
			
			while(space <= (i-1)) {
				System.out.print("  ");
				space++;
			}
			
			int j = 1; // j represents the current column
			while(j <= (n-i+1)) {
				System.out.print("* ");
				j++;
			}
			
			System.out.println();
			i++;
		}
		s.close();

	}

}
