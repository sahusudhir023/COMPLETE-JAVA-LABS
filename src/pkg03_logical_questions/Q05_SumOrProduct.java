package pkg03_logical_questions;

import java.util.Scanner;

public class Q05_SumOrProduct {
	
	/**
	 * @author SUDHIR
	 * Question: Sum or Product of Numbers from 1 to N
	 * Description: This program takes two inputs: a number 'n' and a choice 'c'.
	 * - If c = 1, it prints the sum of numbers from 1 to n.
	 * - If c = 2, it prints the product of numbers from 1 to n.
	 * - For any other choice, it prints -1.
	 * 
	 * <p><b>Example:</b></p>
	 * <pre>
	 * Input: n = 4, c = 1
	 * Output: 10 (1 + 2 + 3 + 4)
	 * 
	 * Input: n = 4, c = 2
	 * Output: 24 (1 * 2 * 3 * 4)
	 * </pre>
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number(n):");
		int n = s.nextInt();
		
		System.out.println("Enter the number of choice(c):");
		int c = s.nextInt();
		
		if(n <= 0) {
			System.out.println("-1");
			s.close();
			return;
		}
		
		if(c == 1) {
			int sum = 0;
			int num = 1;
			while(num <= n) {
				sum = sum + num;
				num++;
			}
			System.out.println("The sum of from 1 to " + n + " is: " +sum);
			
		}else if(c == 2){
			int product = 1;
			int num = 1;
			while(num <= n) {
				product = product * num;
				num++;
			}
			System.out.println("The product of from 1 to " + n + " is: " + product);
			
		}else {
			//Invalid choice
			System.out.println("-1");
		}
		
		s.close();

	}

}
