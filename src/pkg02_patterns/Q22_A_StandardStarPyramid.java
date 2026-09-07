package pkg02_patterns;

import java.util.Scanner;

/**
 * @author SUDHIR 
 * Question: Standard Star Pyramid Pattern
 * Description: This program takes an integer n and prints a full centered pyramid 
 * pattern of stars using three loop.
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
public class Q22_A_StandardStarPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = sc.nextInt();
		
		int i = 1;
		while(i <= n) {
			int space = 1;
			
			while(space <= (n-i)) {
				System.out.print("  ");
				space++;
			}
			
			int j = 1;
			while(j <= i) {
				System.out.print("* ");
				j++;
			}
			
			j = 1;
			while(j <= (i-1)) {
				System.out.print("* ");
				j++;
			}
			
			System.out.println();
			i++;
			
		}
		sc.close();
		
	}

}
