package pkg01_basics;

import java.util.Scanner;

public class Q04_CalculateTotalSalary {
    
	/**
	 * @author SUDHIR
	 * Question: Calculate Total Salary
	 * Description: This program calculates the total salary of an employee
	 * based on basic salary and grade allowance, rounded to the nearest integer.
	 */
	public static void main(String[] args) {
		
		//To take input from user
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the basic salary:");
		double basic = s.nextDouble();
		
		System.out.println("Enter the Grade(Uppercase character):");
		char grade = s.next().charAt(0);
		
		//Percentage calculation
		double hra = (basic * 20) / 100;
		double da = (basic * 50) / 100;
		double pf = (basic * 11) / 100;
		
		int allow = 0;
		
		if(grade == 'A') {
			allow = 1700;
			
		}else if(grade == 'B') {
			allow = 1500;
			
		}else {
			allow = 1300;
		}
		
		double totalSalary = (basic + hra + da + allow -pf);
		
		System.out.println("Total salary is: " + Math.round(totalSalary));
		
		//Close the scanner
        s.close();
	}

}
