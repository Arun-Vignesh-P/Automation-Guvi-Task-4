package Task4;
import java.util.Scanner;
public class Task4e {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a number
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

	        // Check if the number is prime
	        if (isPrime(num)) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }

	        // Close the Scanner object
	        scanner.close();
	    }

	    
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false; // 0 and 1 are not prime numbers
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false; // if the number is divisible by any number between 2 and sqrt(num), it's not prime
	            }
	        }
	        return true; // if the number is not divisible by any number between 2 and sqrt(num), it's prime
	    
	    }

}
