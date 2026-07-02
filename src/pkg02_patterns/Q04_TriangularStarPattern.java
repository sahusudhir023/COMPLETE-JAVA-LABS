package pkg02_patterns;

import java.util.Scanner;

public class Q04_TriangularStarPattern {

	/**
	 * @author SUDHIR Question: Triangular Star Pattern 
	 * Description: This program takes an integer n and 
	 * print a right-angled triangle of stars.
	 * 
	 * *  <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 4
	 * Output:
	 * *
	 * * *
	 * * * *
	 * * * * *
	 * </pre>
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();

		int i = 1; // i represents the current row
		while (i <= n) {
			int j = 1; // j represents the current column
			
			while (j <= i) {
				System.out.print("*" + " ");
				j++;
			}
			
			System.out.println();
			i++;
		}
		s.close();
	}

}
