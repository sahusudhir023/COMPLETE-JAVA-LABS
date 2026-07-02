package pkg02_patterns;

import java.util.Scanner;

public class Q32_CircularRotationOfOddNumbersPattern {
    
	/**
	 * @author SUDHIR
	 * Question: Circular Rotation of Odd Numbers Pattern
	 * Description: This program takes an integer n, generates the first n odd numbers, 
	 * and prints them in a square matrix format with a circular left shift in each row.
	 * * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 4
	 * Output:
	 * 1 3 5 7
	 * 3 5 7 1
	 * 5 7 1 3
	 * 7 1 3 5
	 * </pre>
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i represents the current row
		while(i <= n) {
			int printValue = (2*i) - 1;  // Row starts with the i-th odd number
			int maxValue = (2*n) - 1;    // The absolute maximum odd number in the series
			
			int j = 1;  // j represents the current column
			while(j<=n) {
				System.out.print(printValue + " ");
				printValue+=2;
				
				// Logic: Circular left shift by resetting to 1 when the value exceeds max odd number
				if(printValue > maxValue) {
					printValue = 1;
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
