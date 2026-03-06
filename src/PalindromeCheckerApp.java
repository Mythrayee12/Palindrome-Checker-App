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
     * Prints a welcome message and checks a hardcoded palindrome.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App v1.0");

        // Hardcoded palindrome check
        String testString = "radar";
        boolean isPalindrome = checkPalindrome(testString);

        System.out.println("Is '" + testString + "' a palindrome? " + isPalindrome);
    }

    /**
     * Checks if a string is a palindrome.
     * @param str The string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean checkPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}