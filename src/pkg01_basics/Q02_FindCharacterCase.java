package pkg01_basics;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Find Character Case
 * 
 * Description: 
 * This program takes a single character input from the user and determines 
 * whether it is an uppercase alphabet ('A' - 'Z'), a lowercase alphabet ('a' - 'z'), 
 * or a non-alphabetic character (numbers, symbols, special characters). It outputs:
 *   1  -> If the character is Uppercase
 *   0  -> If the character is Lowercase
 *  -1  -> If the character is Not an Alphabet
 * 
 * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT 1:
 * Enter a character:
 * S
 * SAMPLE OUTPUT 1:
 * 1
 * 
 * SAMPLE INPUT 2:
 * Enter a character:
 * k
 * SAMPLE OUTPUT 2:
 * 0
 * 
 * SAMPLE INPUT 3:
 * Enter a character:
 * 7
 * SAMPLE OUTPUT 3:
 * -1
 * -------------------------------------------
 */
public class Q02_FindCharacterCase {
	
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
