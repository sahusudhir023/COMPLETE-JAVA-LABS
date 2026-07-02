package pkg01_basics;

import java.util.Scanner;

public class Q01_CalculateAverageMarks {
	
	/**
	 * @author SUDHIR
	 * Question: Calculate Average Marks
	 * Description: This program takes the user's name (prints the first character) 
	 * and calculates the average of three test marks.
	 */

	public static void main(String[] args) {
		
		// To take input from the user
		Scanner s = new Scanner(System.in);
		
		// Take Name input (Only first character)
		System.out.println("Enter the Name:");
		char name = s.next().charAt(0);
		
		// Take Marks input for 3 tests
		System.out.println("Enter the marks for Test 1:");
		int m1 = s.nextInt();
		
		System.out.println("Enter the marks for Test 2:");
		int m2 = s.nextInt();
		
		System.out.println("Enter the marks for Test 3:");
		int m3 = s.nextInt();
		
		// 3. Mathematical Logic: Calculating Sum and Average
		int sum = (m1+m2+m3);
		int avg = sum/3;
		
		// Print the final output
		System.out.println("\n---Final Output---");
		System.out.println("User Initial: " + name);
		System.out.println("Average Marks: " + avg);
		
		// Close the scanner
		s.close();
	}

}
