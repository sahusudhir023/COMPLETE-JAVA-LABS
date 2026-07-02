package pkg01_basics;

import java.util.Scanner;

public class Q06_SumOfEvenAndOdd {
    
	/**
	 * @author SUDHIR
	 * Question: Sum of Even and Odd
	 * Description: This program takes an integer as input and 
	 * calculate the sum of its even and odd digit separately.
	 */
	public static void main(String[] args) {
		
		//To take input from user
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = s.nextInt();
		
		int evenSum = 0;
		int oddSum = 0;
		
		while(num>0) {
			int lastDigit = num % 10;
			if(lastDigit % 2 == 0) {
				evenSum = evenSum + lastDigit;
				
			}else {
				oddSum = oddSum + lastDigit;
			}
			num/=10;
		}
		
		System.out.println("Sum of even digit: " + evenSum +"\t"+ "Sum of odd digit: " + oddSum);
        
		//Close the scanner
		s.close(); 
	}

}
