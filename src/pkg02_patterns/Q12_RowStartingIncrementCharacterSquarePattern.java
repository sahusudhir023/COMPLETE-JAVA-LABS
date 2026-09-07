package pkg02_patterns;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Row Starting Increment Character Square Pattern
 * Description: This program takes an integer n and prints a square pattern 
 * where each row starts with a specific character based on the row number, 
 * and subsequent characters increment by 1.
 * 
 * <p><b>Example:</b></p>
 * <pre>
 * Input: n = 4
 * Output:
 * A B C D 
 * B C D E 
 * C D E F 
 * D E F G 
 * </pre>
 */
public class Q12_RowStartingIncrementCharacterSquarePattern {
    
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i represents the current row
		while(i <= n) {
			char startingChar = (char)('A' + i - 1);
			
			int j = 1; //j represents the current column
			while(j <= n) {
				System.out.print(startingChar + " ");
				startingChar++;
				j++;
			}
			
			System.out.println();
			i++;
		}
		s.close();

	}

}
