package pkg02_patterns;

import java.util.Scanner;

public class Q03_InputNumberSquarePattern {
	
	/**
	 * @author SUDHIR 
	 * Question: Input Number Square Pattern or Constant Number Square Pattern 
	 *Description: This program takes an integer n and
	 * prints an n x n square where every position contains the input number 'n' itself.
	 * 
	 * *  <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 4
	 * Output:
	 * 4 4 4 4
	 * 4 4 4 4 
	 * 4 4 4 4
	 * 4 4 4 4
	 * </pre>
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number of rows(n)");
		int n = s.nextInt();

		int i = 1; // i represents the current row
		while (i <= n) {
			int j = 1; // j represents the current column
			
			while (j <= n) {
				System.out.print(n + " ");
				j++;
			}
			
			System.out.println(); // Next line
			i++;
		}
		s.close();
	}

}
