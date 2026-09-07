package pkg02_patterns;

import java.util.Scanner;

/**
 * @author SUDHIR
 * Question: Continuous Character Triangle Pattern(Floyd's Character Triangle)
 * Description: This program takes an integer n and prints a triangle pattern
 * where characters keep counting upwards continuously from 'A' to the end.
 * 
 * <p><b>Example:</b></p>
 * <pre>
 * Input: n = 4
 * Output:
 * A 
 * B C 
 * D E F 
 * G H I J 
 * </pre>
 */
public class Q13_ContinuousCharacterTriangle {
    
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i represents the current row
		char countChar = (char)('A');
		while(i <= n) {
			int j = 1; // j represents the current column
			
			while(j <= i) {
				System.out.print(countChar + " ");
				countChar++;
				j++;
			}
			
			System.out.println();
			i++;
		}
		s.close();

	}

}
