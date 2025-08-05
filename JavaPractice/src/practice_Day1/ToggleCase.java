package practice_Day1;

import java.util.Scanner;

public class ToggleCase {
	
	public static String toggleCase(String text) {
		
		String str = "";
		
		for(int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				str = str + Character.toLowerCase(ch);
			}
			else {
				str = str + Character.toUpperCase(ch);
			}
		}
		return str;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String text = input.nextLine();
		String output = toggleCase(text);
		System.out.println(output);
		input.close();

	}

}
