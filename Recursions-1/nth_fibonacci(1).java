import java.util.Scanner;

public class nth_fibonacci {
    public static int printNthFibonacci(int n){
        if (n==0 || n==1) {
            return n;
        }
        int fn_1=printNthFibonacci(n-1);
        int fn_2=printNthFibonacci(n-2);
        int fn=fn_1+fn_2;
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n:");
        int n=sc.nextInt();

        int output=printNthFibonacci(n);
        System.out.println("The nth fibonacci number is :"+output);
    }
}
