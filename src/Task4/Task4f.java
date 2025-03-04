package Task4;
import java.util.Scanner;
public class Task4f {

	public static void main(String[] args) {
		// Factorial
		 Scanner scanner = new Scanner(System.in);
	        // Prompt the user to enter a number
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

	        // Check if the number is negative
	        if (num < 0) {
	            System.out.println("Error: Factorial is not defined for negative numbers.");
	        } else {
	            // Calculate the factorial
	            long factorial = calculateFactorial(num);

	            // Print the result
	            System.out.println(num + "! = " + factorial);
	        }

	        // Close the Scanner object
	        scanner.close();
	    }

	    
	    public static long calculateFactorial(int num) {
	        long factorial = 1;
	        for (int i = 1; i <= num; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }
	}
