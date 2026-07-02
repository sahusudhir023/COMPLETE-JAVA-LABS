package pkg01_basics;

import java.util.Scanner;

public class Q07_Factors {
    
	/**
	 * @author SUDHIR
	 * Question: Factors
	 * Description: This program takes an integer as input and
	 * print the factors(excluding 1 and the number itself) using while loop
	 */
	public static void main(String[] args) {
		
		//To take input from user
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the integer number:");
		int n = s.nextInt();
		
		int i = 2;
		while(i < n) {
			if(n % i == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		//Close the scanner
		s.close();
		  
	}

}
