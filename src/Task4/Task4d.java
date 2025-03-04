package Task4;

import java.util.Scanner;

public class Task4d {

	public static void main(String[] args) {
		// Swap
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Swap the values using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Print the swapped values
        System.out.println("Swapped values:");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        // Close the Scanner object
        scanner.close();
	}
	
}
