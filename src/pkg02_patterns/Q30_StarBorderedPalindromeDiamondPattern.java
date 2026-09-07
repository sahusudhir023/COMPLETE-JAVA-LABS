package pkg02_patterns;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Star-Bordered Palindrome Diamond Pattern
 * Description: This program takes an integer n and prints a diamond pattern where 
 * numbers follow a palindrome sequence, bordered by stars on both sides.
 * * <p><b>Example:</b></p>
 * <pre>
 * Input: n = 7
 * Output:
 * *
 * *1*
 * *121*
 * *12321*
 * *121*
 * *1*
 * *
 * </pre>
 */
public class Q30_StarBorderedPalindromeDiamondPattern {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int n = s.nextInt();
		
		int n1 = (n+1)/2;  // First half number of rows
		int n2 = n/2;      // Second half number of columns
		
		// --- FIRST HALF ---
		int i1 = 1;  // i1 represents the current row for first half
		while(i1 <= n1) {
			System.out.print("*");
			
			//--Increasing number 
			int j1 = 1;  // j1 represents the current column first half
			while(j1 <= (i1-1)) {
				System.out.print(j1);
				j1++;
			}
			
			//--Decreasing number
			int j2 = i1-2;  // j2 represents the current column first half
			while(j2 >= 1) {
				System.out.print(j2);
				j2--;
			}
			
			if(i1 > 1) {
				System.out.print("*");
			}
			System.out.println();
			i1++;
		}
		
		// ----- SECOND HALF -----
		int i2 = n2;  // i2 represents the current row for second half
		while(i2 >= 1) {
			System.out.print("*");
			
			//--Increasing number 
			int j1 = 1;
			while(j1 <= (i2-1)) {
				System.out.print(j1);
				j1++;
			}
			
			//--Decreasing number
			int j2 = (i2-2);
			while(j2 >= 1) {
				System.out.print(j2);
				j2--;
			}
			
			if(i2 > 1) {
				System.out.print("*");
			}
			
			System.out.println();
			i2--;
		}
		
		s.close();
		
			
	}

}
