package practice_Day1;

import java.util.Scanner;

public class findLength {
	
	public static int lengthOfString(String word) {
		
		char[] words = word.toCharArray();
		
		int count = 0; 
		
		for( char ch : words) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String word = input.nextLine();
		
		int totalLength = lengthOfString(word);
		
		System.out.println("The length of String is: "+ totalLength);
		
		input.close();

	}

}
