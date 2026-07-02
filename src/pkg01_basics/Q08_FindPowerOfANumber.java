package pkg01_basics;

import java.util.Scanner;

public class Q08_FindPowerOfANumber {
    
	/**
	 * @author SUDHIR
	 * Question: Find Power of a Number
	 * Description: This program takes an integer x and n as input and
	 * calculate/print power of a number(x raised to the power n)
	 */
	public static void main(String[] args) {
		
		//To take input from user
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the base number");
		int x = s.nextInt();
		
		System.out.println("Enter the power number");
		int n = s.nextInt();
		
		int i = 1;
		int ans = 1;
		while(i <= n) {
			ans = ans * x;
			i++;
		}
		System.out.println("Base x="+ x + " ,Power n=" + n +" = "+ ans);
		
	}

}
