package pkg03_logical_questions;

import java.util.Scanner;

public class NcRCalculator {
	
	/**
	 * @author SUDHIR
	 * Question: Calculate nCr (Combination)
	 * Description: This program takes two integers n (total objects) and r (objects chosen) 
	 * as input and calculates the total combinations using the formula: nCr = n! / (r! * (n-r)!)
	 * 
	 * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 5, r = 2
	 * Output:
	 * Enter the integer number of total objects(n): 5
	 * Enter the integer number of objects chosen at once(r): 2
	 * 5c2 Calculate is : 10
	 * </pre>
	 */
	public static int factorial(int a) {
		
		int ans = 1;
		for(int i=1; i<=a; i++) {
			ans *= i;
		}
		
		return ans;
	}
	
	public static int ncr(int n, int r) {
		
		int nume = factorial(n);
		int deno1 = factorial(r);
		int deno2 = factorial(n-r);
		
		int ans = nume / (deno1 * deno2);
		
		return ans;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the integer number of total objects(n):");
		int n = s.nextInt();
		
		System.out.println("Enter the integer number of objects chosen at once(r):");
		int r = s.nextInt();
		
		System.out.println(n + "c" + r + " Calculate is : " + ncr(n,r));
		
		s.close();

	}

}
