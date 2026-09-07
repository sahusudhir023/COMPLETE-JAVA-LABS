package pkg02_patterns;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Equilateral Star Pyramid Pattern
 * Description: This program takes an integer n and prints a centered equilateral 
 * triangle pattern of stars with gaps between them.
 * 
 * <p><b>Example:</b></p>
 * <pre>
 * Input: n = 4
 * Output:
 *    * 
 *   * * 
 *  * * * 
 * * * * * 
 * </pre>
 */
public class Q23_TrianglePyramidwithSpaces {
    
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i represents the current row
		while(i <= n) {
			int space = 1;
			// Single space loop to center the triangle
			while(space <= (n-i)) {
				System.out.print(" ");
				space++;
			}
			
			int j = 1; // j represents the current column
			// Logic: Trailing space after star creates a perfect equilateral triangle effect.
			while(j <= i) {
				System.out.print("* ");
				j++;
			}
			
			System.out.println();
			i++;
		}
		s.close();
	}

}
