import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number; // Store the original number
        int result = 0; // Initialize result to 0
        int n = 0; // To count the number of digits

        // Find the number of digits in the number
        for (int temp = number; temp != 0; temp /= 10) {
            n++;
        }

        // Calculate the sum of the nth power of each digit
        for (int temp = number; temp != 0; temp /= 10) {
            int digit = temp % 10; // Extract the last digit
            result += Math.pow(digit, n); // Add the nth power of the digit to the result
        }

        // Check if the original number is equal to the result
        if (originalNumber == result) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }
}
