package pkg01_basics;

import java.util.Scanner;

/**
 * @author SUDHIR
 * Question: Swap Two Numbers Without Third Variable
 * * Description: 
 * This program swaps the values of two integer variables using arithmetic addition 
 * and subtraction without using any extra or temporary variable, making it memory efficient.
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * a = 10, b = 20
 * * --- INPUT DATA ---
 * Before Swap: a = 10, b = 20
 * * --- OUTPUT DATA ---
 * After Swap: a = 20, b = 10
 * -------------------------------------------
 */
public class Q09_B_SwapNumberWithOutThirdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number(a):");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number(b):");
		int b = sc.nextInt();
		
		System.out.println("\n--- INPUT DATA ---");
		System.out.println("Before Swap: a=" + a + ", b=" + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("\n--- OUTPUT DATA ---");
		System.out.println("After Swap: a=" + a + ", b=" + b);
		
		sc.close();
	}

}
