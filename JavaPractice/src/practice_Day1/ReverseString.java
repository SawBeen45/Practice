package practice_Day1;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverseOfString(String text) {
		
		if(text.length()==0) {
			return "No input provided: ";
		}
		
		char[] word = text.toCharArray();
		
		String reverse = "";
		
		for(int i = word.length-1; i >=0; i--) {
			reverse = reverse + word[i];
			
		}
		return reverse;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String text = input.nextLine();
		
		String output = reverseOfString(text);
		
		System.out.println(output);
		
		input.close();
	}

}
