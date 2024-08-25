import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a string to reverse: ");
        String userInput = scanner.nextLine();
        
        if (!userInput.isEmpty()) {
            // Call the reverseString method and store the result
            String reversedString = reverseString(userInput);
            // Print the reversed string
            System.out.println("Reversed String: " + reversedString);
        } else {
            // Print a message if no input was provided
            System.out.println("You didn't enter anything!");
        }
        
        // Close the scanner
        scanner.close();
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();  //reverse the string
    }
    
}
