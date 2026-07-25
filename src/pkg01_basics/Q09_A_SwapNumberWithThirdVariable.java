package pkg01_basics;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Swap Two Numbers With Third Variable
 * * Description: 
 * This program swaps the values of two integer variables using a temporary third 
 * variable (temp). It holds the value of the first variable temporarily during 
 * the exchange process.
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
public class Q09_A_SwapNumberWithThirdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number(a):");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number(b):");
		int b = sc.nextInt();
		
		System.out.println("\n--- INPUT DATA ---");
		System.out.println("Before Swap: a=" + a + ", b=" + b);
		
		int temp;
		
		temp = b;
		b = a;
		a = temp;
		
		System.out.println("\n--- OUTPUT DATA ---");
		System.out.println("After Swap: a=" + a + ", b=" + b);
		
		sc.close();
	}

}
