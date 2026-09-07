package pkg02_patterns;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Reverse Row Starting Character Triangle Pattern
 * Description: This program takes an integer n and prints a triangle pattern 
 * where rows start from a reverse character offset based on n, and increment 
 * upwards column by column.
 * 
 * <p><b>Example:</b></p>
 * <pre>
 * Input: n = 5
 * Output:
 * E 
 * D E 
 * C D E 
 * B C D E 
 * A B C D E 
 * </pre>
 */
public class Q14_InterestingAlphabetsPattern {
    
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i represents the current row
		while(i <= n) {			
			int j = 1; // j represents the current column
			
			while(j <= i) {
				System.out.print((char)('A' + n - i + j -1) + " ");
				j++;
			}
			
			System.out.println();
			i++;		
		}
		s.close();

	}

}
