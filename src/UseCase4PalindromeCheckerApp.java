import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Input Text: ");
        String s=input.nextLine();
       char r[]=s.toCharArray();
       int i=0;
       int j=s.length()-1;
       boolean t=true;
        while(i<j){
            if(r[i]!=r[j]){
                t=false;
                break;
            }
            i++;
            j--;

        }
        if(t){
            System.out.println("the  string "+s+" is a palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
