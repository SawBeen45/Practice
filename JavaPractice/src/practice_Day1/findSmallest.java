package practice_Day1;

import java.util.Scanner;

public class findSmallest {

    public static int findMin(int[] numbers) {
        // Handle empty array case
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int min = numbers[0];
        // Start from index 1 since we already have numbers[0] as min
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            // Get array size with validation
            int size;
            do {
                System.out.print("Enter the size of the array: ");
                size = input.nextInt();
                if (size <= 0) {
                    System.out.println("Please enter a positive number.");
                }
            } while (size <= 0);

            int[] numbers = new int[size];

            // Get array elements
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                numbers[i] = input.nextInt();
            }

            // Find and display the minimum
            int min = findMin(numbers);
            System.out.println("The smallest element in the array is: " + min);
            
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            input.close();
        }
    }
}