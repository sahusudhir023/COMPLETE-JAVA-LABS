package pkg02_patterns;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Triangular Number Pattern
 * Description: This program takes an integer n and prints a right-angled triangle 
 * where each row starts from 1 and counts up to the current row number.
 * 
 * * <p><b>Example:</b></p>
 * <pre>
 * Input: n = 4
 * Output:
 * 1
 * 1 2 
 * 1 2 3
 * 1 2 3 4
 * </pre>
 */
public class Q05_TriangularNumberPattern {
    
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i represents the current row
		while(i <= n) {			
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
