package pkg02_patterns;

import java.util.Scanner;

public class Q02_ReverseNumberSquarePattern {
    
	/**
	 * @author SUDHIR
	 * Question: Reverse Number Square Pattern
	 * Description: This program takes an input n and print n*n 
	 * square pattern with number counting backwards from n to 1. 
	 * 
	 * * <p><b>Example:</b></p>
     * <pre>
     * Input: n = 4
     * Output:
     * 4 3 2 1
     * 4 3 2 1
     * 4 3 2 1
     * 4 3 2 1
     * </pre>
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i represents the current row
		while(i <= n) {			
			int j = 1; // j represents the current column
			
			while(j <= n) {			
				System.out.print((n- j + 1) + " ");
				j++;
			}
			
			System.out.println();
			i++;
		}	
		s.close();
	}

}
