import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence to check palindrome:");
        String input = sc.nextLine();

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(normalized);

        if (result) {
            System.out.println("The given input is a Palindrome.");
        } else {
            System.out.println("The given input is NOT a Palindrome.");
        }

        sc.close();
    }
}