package pkg02_patterns;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Mirror Image Continuous Number Triangle Pattern
 * Description: This program takes an integer n and prints a right-aligned triangle[cite: 3]
 * where numbers count upwards continuously from 1 to the end.[cite: 3]
 * 
 * <p><b>Example:</b></p>
 * <pre>
 * Input: n = 4
 * Output:
 *       1 
 *     2 3 
 *   4 5 6 
 * 7 8 9 10 
 * </pre>
 */
public class Q18_MirrorImageContinuousNumberTriangle {
    
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i represents the current row
		int countNum = 1;
		while(i <= n) {
			int space = 1;
			
			while(space <= (n-i)) {
				System.out.print("  ");
				space++;
			}
			
			int j = 1; // j represnts the current column
			while(j <= i) {
				System.out.print(countNum + " ");
				countNum++;
				j++;
			}
			
			System.out.println();
			i++;
		}
		s.close();
	}

}
