package practice_Day1;

import java.util.Scanner;

public class FindSecondLargest {
	
	public static int SecondLargest(int[] arr) {
		
		int largest, secondLargest;
		
		if(arr[0] > arr[1]) {
			largest = arr[0];
			secondLargest = arr[1];
		}
		else {
			largest = arr[1];
			secondLargest = arr[0];
		}
		
		for(int i = 2; i< arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] > secondLargest){
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}
	
	

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		
		int size = input.nextInt();
		
		int[] numbers = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println("Enter the element on postition "+ (i+1) +" :" );
			numbers[i] = input.nextInt();
		}
		
		int output = SecondLargest(numbers);
		System.out.println("The second Largest element is: "+ output);
		input.close();

	}

}
