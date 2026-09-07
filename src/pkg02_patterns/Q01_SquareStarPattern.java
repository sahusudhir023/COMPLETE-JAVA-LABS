package pkg02_patterns;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Square Star Pattern
 * Description: This program takes an integer n and print n * n star pattern.
 * 
 * * <p><b>Example:</b></p>
 * <pre>
 * Input: n = 4
 * Output:
 * * * * * 
 * * * * * 
 * * * * * 
 * * * * * 
 * * * * * 
 * </pre>
 */
public class Q01_SquareStarPattern {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i represents the current row
		while(i <= n) {		
			int j = 1; // j represents the current column
			
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
