package pkg02_patterns;

import java.util.Scanner;

public class Q16_MirrorImageNumberTriangle {
    
	/**
	 * @author SUDHIR
	 * Question: Mirror Image Number Triangle Pattern
	 * Description: This program takes an integer n and prints a right-aligned triangle[cite: 3]
	 * where each row counts upwards from 1 to the current row number.[cite: 3]
	 * 
	 * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 4
	 * Output:
	 *       1 
	 *     1 2 
	 *   1 2 3 
	 * 1 2 3 4 
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
			
			System.out.println();
			i++;
		}
		s.close();
	}

}
