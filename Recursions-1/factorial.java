import java.util.Scanner;

public class factorial {
    public static int factorial(int num){
        if (num==0) {
            return 1;
        }
        int call = factorial(num-1);
        int result= num * call;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int output =factorial(num);
        System.out.println("Factorial of "+num+" is "+output+" .");
    }
}
