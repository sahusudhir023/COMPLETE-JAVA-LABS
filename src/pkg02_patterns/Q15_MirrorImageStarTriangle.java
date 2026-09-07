package pkg02_patterns;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Mirror Image Star Triangle Pattern
 * Description: This program takes an integer n and prints a right-angled triangle 
 * pattern of stars aligned to the right side, prefixed with spaces.[cite: 3]
 * 
 * <p><b>Example:</b></p>
 * <pre>
 * Input: n = 4
 * Output:
 *       * 
 *     * * 
 *   * * * 
 * * * * * 
 * </pre>
 */
public class Q15_MirrorImageStarTriangle {
    
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i respresnts the current row
		while(i <= n) {
			int space = 1; 
			
			while(space <= (n-i)) {
				System.out.print("  ");
				space++;
			}
			
			int j = 1; //j represents the current column
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
