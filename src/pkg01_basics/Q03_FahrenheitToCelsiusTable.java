package pkg01_basics;

import java.util.Scanner;

public class Q03_FahrenheitToCelsiusTable {
	
	/**
	 * @author SUDHIR
	 * Question: Fahrenhiet to Celsius Table
	 * Description: This program takes Start, End, and Step Fahrenheit values 
	 * and converts them into a Celsius table using a loop.
	 */
	public static void main(String[] args) {
		
		//To take input from user
		Scanner s = new Scanner(System.in);
		
		//Take 3 Input start, end, step
		System.out.println("Enter the start fahrenhiet value:");
		int start = s.nextInt();
		
		System.out.println("Enter the end fahrenhiet value:");
		int end = s.nextInt();
		
		System.out.println("Enter the step size:");
		int size = s.nextInt();
		
		//Loop convert and print table
		while(start <= end) {		
			int celsius = (5 * (start-32)) / 9;	
			
			System.out.println(start + "\t" + celsius);
			start += size;  // Increament By step size
		}
		
		//Close the scanner
		s.close();

	}

}
