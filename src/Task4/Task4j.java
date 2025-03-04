package Task4;
import java.util.Scanner;
public class Task4j {

	public static void main(String[] args) {
		// Number of digits
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int digitCount = countDigits(num);

        System.out.println("Number of digits: " + digitCount);

        scanner.close();
    }

        public static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }

        int digitCount = 0;
        while (num != 0) {
            num /= 10;
            digitCount++;
        }
        return digitCount;
	}

}
