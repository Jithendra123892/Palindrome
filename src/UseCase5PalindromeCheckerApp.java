import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args){
        String input="noon";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<input.length();i++){
            stack.push(input.charAt(i));
        }
        boolean t=true;
        for (int i = 0; i < input.length(); i++) {

            char poppedChar = stack.pop();

            if (input.charAt(i) != poppedChar) {
                t = false;
                break;
            }
        }

        // Print result
        if (t) {
            System.out.println(input+ " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}
