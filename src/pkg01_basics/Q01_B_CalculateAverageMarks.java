package pkg01_basics;

import java.util.Scanner;



/**
 * @author SUDHIR
 * Question: Calculate Average Marks
 * 
 * Description: 
 * This program takes a user's name, the total number of subjects, and the marks 
 * scored in each test. It iterates through the subject count to compute the 
 * total marks and calculates the precise average marks using floating-point 
 * division, printing the formatted result to the console.
 * 
 * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter your name:
 * SUDHIR
 * Enter the number of subjects:
 * 3
 * Enter the marks for Test 1:
 * 85
 * Enter the marks for Test 2:
 * 90
 * Enter the marks for Test 3:
 * 88
 * 
 * SAMPLE OUTPUT:
 * ---Final Output---
 * SUDHIR -> Avg mark: 87.66666666666667
 * -------------------------------------------
 */
public class Q01_B_CalculateAverageMarks {

	public static void averageMark(Scanner sc) {
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		
		System.out.println("Enter the number of subject");
		int numSub = sc.nextInt();
		
		double totalMark = 0;
		for(int i = 1; i <= numSub; i++) {
			System.out.println("Enter the mark for Test: " + i);
			double testMark = sc.nextDouble();
			
			totalMark  = totalMark + testMark;
		}
		
		double avgMark = totalMark / numSub;
		
		System.out.println("\n--- Final Output ----");
		System.out.println(name + "-> Average Mark: " + avgMark);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		averageMark(sc);
		
		sc.close();	
	}

}
