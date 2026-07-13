package pkg04_string;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Print All Characters on a Separate Line
 * * Description: 
 * This program takes a string input from the user and iterates through each 
 * character using a loop, printing every character on a new line using charAt().
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter the words:
 * SUDHIR
 * * SAMPLE OUTPUT:
 * S
 * U
 * D
 * H
 * I
 * R
 * -------------------------------------------
 */
public class Q01_PrintAllCharOfSeparateLine {
	
	public static void printChars(String str) {
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the words:");
		String str = sc.nextLine();
		
		printChars(str);
		
		sc.close();
	}

}
