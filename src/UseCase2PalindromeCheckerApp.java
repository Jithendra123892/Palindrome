import java.util.Scanner;

public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        String s="madam";
        System.out.println("Input Text: "+s);
        boolean t= true;
        String r="madam";

        if(s.equals(r)){
            System.out.println("Is it a Palindrome: "+t);
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}
