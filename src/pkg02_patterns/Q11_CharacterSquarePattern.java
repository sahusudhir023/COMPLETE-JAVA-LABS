package pkg02_patterns;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Character Square Pattern
 * Description: This program takes an integer n and prints a square pattern
 * where each row contains characters starting from 'A' up to the n-th alphabet.
 * * <p><b>Example:</b></p>
 * <pre>
 * Input: n = 4
 * Output:
 * A B C D 
 * A B C D 
 * A B C D 
 * A B C D 
 * </pre>
 */
public class Q11_CharacterSquarePattern {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();

		int i = 1; // i represents the current row
		while (i <= n) {
			int j = 1; // j represents the current column

			while (j <= n) {
				System.out.print((char) ('A' + j - 1) + " ");
				j++;
			}

			System.out.println();
			i++;
		}
		s.close();
	}

}
