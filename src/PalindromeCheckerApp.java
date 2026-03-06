import java.util.Scanner;

/**
 * Palindrome Checker Application - Entry point for the application.
 * This class demonstrates the basic execution flow of a Java program.
 *
 * @author Mythrayee
 * @version 1.0
 */
public class PalindromeCheckerApp {

    /**
     * Main method - Entry point of the application.
     * Prints a welcome message and allows multiple palindrome checks.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App v1.0");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string to check if it's a palindrome (or 'quit' to exit): ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("quit")) {
                break;
            }

            boolean isPalindrome = checkPalindrome(userInput);

            System.out.println("Is '" + userInput + "' a palindrome? " + isPalindrome);
            System.out.println();
        }

        System.out.println("Thank you for using Palindrome Checker App!");
        scanner.close();
    }

    /**
     * Checks if a string is a palindrome (case insensitive).
     * @param str The string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean checkPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}