package pkg02_patterns;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Floyd's Triangle Pattern (Continuous Number Triangle)
 * Description: This program takes an integer n and prints a triangle where 
 * numbers keep counting upwards continuously from 1 to the end.
 * 
 * * <p><b>Example:</b></p>
 * <pre>
 * Input: n = 4
 * Output:
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * </pre>
 */
public class Q07_FloydsTrianglePattern {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i represents the current row
		int counter = 1;
		while(i <= n) {
			int j = 1; // j represents the current column
			
			while(j <= i) {
				System.out.print(counter + " ");
				counter++;
				j++;
			}
			
			System.out.println();
			i++;
		}		
		s.close();
	}

}
