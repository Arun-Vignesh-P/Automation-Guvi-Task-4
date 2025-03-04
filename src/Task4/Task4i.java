package Task4;
import java.util.Scanner;
public class Task4i {

	public static void main(String[] args) {
		// Senior Citizen
		Scanner scanner = new Scanner(System.in);

        // Enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 60) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("You are not a senior citizen.");
        }

        scanner.close();
    
	}

}
