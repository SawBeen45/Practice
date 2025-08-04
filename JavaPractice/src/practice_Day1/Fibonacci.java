package practice_Day1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many series of number you want? ");
		int num = input.nextInt();
		
		int first  = 0;
		int second = 1;
		int next;
		
		System.out.print(first+ " ");
		System.out.print(second+ " ");
		
		for(int i = 2; i < num; i++) {
			next = first + second;
			first = second;
			second = next;
			System.out.print(next+ " ");
		}
		input.close();
	
	

	}

}
