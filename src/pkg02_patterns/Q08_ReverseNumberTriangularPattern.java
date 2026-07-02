package pkg02_patterns;

import java.util.Scanner;

public class Q08_ReverseNumberTriangularPattern {
	
    /**
     * @author SUDHIR
     * Question: Reverse Number Triangle pattern
     * Description: This program takes an integer n and print 
     * triangle pattern reverse number. 
     * 
     * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 4
	 * Output:
	 * 1 
	 * 2 1 
	 * 3 2 1 
	 * 4 3 2 1
	 * </pre>
     */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows(n):");
		int n = s.nextInt();
		
		int i = 1; // i represents the current row
		while(i <= n) {
			int j = 1; // j represents the current column
						
			while(j <= i) {
				System.out.print((i - j + 1) + " ");
				j++;
			}
			
			System.out.println();
			i++;
		}
        s.close();
	}

}
