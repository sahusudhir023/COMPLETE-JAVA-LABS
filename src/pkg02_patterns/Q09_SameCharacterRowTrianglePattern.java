package pkg02_patterns;

import java.util.Scanner;

public class Q09_SameCharacterRowTrianglePattern {
	
	/**
	 * @author SUDHIR
	 * Question: Same Character Row Triangle Pattern
	 * Description: This program takes an integer n and prints a triangle pattern
	 * where each row contains the same character, starting from 'A' and changing
	 * to the next alphabet in every new row.
	 * 
	 * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 4
	 * Output:
	 * A 
	 * B B 
	 * C C C 
	 * D D D D 
	 * </pre>
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i represents the current row
		while(i <= n) {
			int j = 1; // j represents the current column
			
			while(j <= i) {
				System.out.print((char)('A' + i - 1) + " ");
				j++;
			}
			
			System.out.println();
			i++;
		}
		s.close();
 
	}

}
