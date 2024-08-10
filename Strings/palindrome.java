import java.util.*;
public class palindrome {
    public static boolean isPalindrome(String input){
        for (int i = 0; i < input.length()/2; i++) {
            if ((input.charAt(i)==input.charAt(input.length()-i-1))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word:");
        String input=sc.nextLine();

        boolean check=isPalindrome(input);
        
        if (check==true) {
            System.out.println("The input keyword is a palindrome.");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
