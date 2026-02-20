import java.util.Scanner;
public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Input Text: ");
        String s=input.nextLine();
        String r=" ";
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        if(s.equals(r)){
            System.out.println("the  string is a palindrome "+s);
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}
