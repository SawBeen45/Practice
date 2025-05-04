package practice_Day1;

import java.util.Scanner;


public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime
        }

        // Only check up to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, not prime
            }
        }

        return true; // No divisors found, prime
    }
}

