package practice_Day1;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = input.nextInt();
		
		int count = 0;
		while(num > 0) {
			num = num/10;
			count++;
		}
		System.out.println(count);
		input.close();

	}

}
