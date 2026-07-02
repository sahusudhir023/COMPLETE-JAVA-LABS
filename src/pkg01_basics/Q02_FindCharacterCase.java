package pkg01_basics;

import java.util.Scanner;

public class Q02_FindCharacterCase {
	
	/**
	 * @author SUDHIR
	 * Question: Find Character Case
	 * Description: This program takes a single character as input and determines
	 * if it is Uppercase (prints 1), Lowercase (prints 0), or any other character (prints -1).
	 */

	public static void main(String[] args) {
		
		// To take input from user
		Scanner s = new Scanner(System.in);
		
		//Take character input
		System.out.println("Enter the character");
		char ch = s.next().charAt(0);
		
		//Logic to check character case
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("1");
			
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println("0");
			
		}else {
			System.out.println("-1");
		}
		
		//Close the scanner
		s.close();

	}

}
