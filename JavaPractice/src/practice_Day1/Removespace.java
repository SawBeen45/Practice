package practice_Day1;

import java.util.Scanner;

public class Removespace {
	
	public static String removeSpace(String text) {
		
		String newStr = text.replace(" ", "");
		return newStr;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String text = input.nextLine();
		
		String output = removeSpace(text);
		System.out.println(output);
		input.close();
	}

}
