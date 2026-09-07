package pkg02_patterns;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Inverted Number Pattern
 * Description: This program takes an integer n and prints an inverted triangle 
 * where each row displays the current row's countdown value repeated.
 * * <p><b>Example:</b></p>
 * <pre>
 * Input: n = 4
 * Output:
 * 4 4 4 4 
 * 3 3 3 
 * 2 2 
 * 1 
 * </pre>
 */
public class Q20_InvertedNumberPattern {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i represents the current row
		while(i <= n) {
			int j = 1; // j represents the current column
			
			while(j <= (n-i+1)) {
				System.out.print((n-i+1) + " ");
				j++;
			}
			
			System.out.println();
			i++;
		}
		s.close();
	}

}
