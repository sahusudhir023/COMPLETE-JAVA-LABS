package pkg02_patterns;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Row Sum Evaluation Series Pattern
 * Description: This program takes an integer n and prints the mathematical 
 * addition sequence from 1 up to the current row number along with their sum.
 * * <p><b>Example:</b></p>
 * <pre>
 * Input: n = 5
 * Output:
 * 1=1
 * 1+2=3
 * 1+2+3=6
 * 1+2+3+4=10
 * 1+2+3+4+5=15
 * </pre>
 */
public class Q31_RowSumEvaluationSeriesPattern {
   
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int sum = 0;
		int i = 1;  // i represents the current row
		while(i <= n) {
			sum = sum + i;
			
			int j = 1; // j represents the current column
			while(j <= i) {
				System.out.print(j);
				
				// Logic: Prints '=' at the end of the sequence, otherwise prints '+'
				if(j == i) {
					System.out.print("=");
				}else {
					System.out.print("+");
				}
				j++;
			}
			
			System.out.print(sum);
			System.out.println();
			i++;
		}
		s.close();
	}

}
