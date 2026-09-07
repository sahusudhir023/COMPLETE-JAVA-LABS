package pkg02_patterns;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Palindrome Row-Starting Increment Pyramid Pattern
 * Description: This program takes an integer n and prints a centered pyramid where[cite: 3]
 * each row starts at the row number, increments to a peak, and then decreases.
 * 
 * <p><b>Example:</b></p>
 * <pre>
 * Input: n = 4
 * Output:
 *       1 
 *     2 3 2 
 *   3 4 5 4 3 
 * 4 5 6 7 6 5 4 
 * </pre>
 */
public class Q25_PalindromeRowStartingIncrementPyramid {
    
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
			
			int j = 1;
			int startingNumber = i;
			while(j <= i) {
				System.out.print(startingNumber + " ");
				startingNumber++;
				j++;
			}
			
			int startingNum = (2*i-2);
			while(startingNum >= i) {
				System.out.print(startingNum + " ");
				startingNum--;
			}
			
			System.out.println();
			i++;
		}
		s.close();
	}

}
