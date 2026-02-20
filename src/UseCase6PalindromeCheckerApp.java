import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args){
        String word = "level";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            queue.add(word.charAt(i));
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();
            char fromStack = stack.pop();
            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}
