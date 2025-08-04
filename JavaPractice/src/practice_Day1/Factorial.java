package practice_Day1;

import java.util.Scanner;

public class Factorial {
	
	public static int findFactorial(int num) {
		
		if (num == 0 || num == 1) {
			return 1;
		}
		int fact = 1;
		
		for(int i =1; i<=num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = input.nextInt();
		
		int output = findFactorial(num);
		System.out.println(output);
		input.close();
		
	}

}
