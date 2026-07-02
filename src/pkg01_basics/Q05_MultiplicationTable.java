package pkg01_basics;

import java.util.Scanner;

public class Q05_MultiplicationTable {
	
	/**
	 * @author SUDHIR
	 * Question: Multiplication Table
	 * Description: "This program takes a natural number N as input and prints its multiplication table."
	 */
	public static void main(String[] args) {
		
		//To take input from user
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the natural number");
		int n = s.nextInt();
		
		int i = 1;
		while(i <= 10) {			
			System.out.println(n + " * " + i + " = " + (n * i));
			i++;
		}
		
		//Close the scanner
		s.close();
	}

}
