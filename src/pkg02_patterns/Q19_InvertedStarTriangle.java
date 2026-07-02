package pkg02_patterns;

import java.util.Scanner;

public class Q19_InvertedStarTriangle {
    
	/**
	 * @author SUDHIR
	 * Question: Inverted Star Triangle Pattern
	 * Description: This program takes an integer n and prints an inverted triangle 
	 * pattern where the number of stars decreases from n down to 1 row by row.[cite: 3]
	 * 
	 * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 4
	 * Output:
	 * * * * * 
	 * * * * 
	 * * * 
	 * * 
	 * </pre>
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i represents the current row
		while(i <= n) {
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
